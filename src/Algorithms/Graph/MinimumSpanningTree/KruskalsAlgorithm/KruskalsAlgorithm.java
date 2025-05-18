package Algorithms.Graph.MinimumSpanningTree.KruskalsAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Algorithms.Graph.WeightedGraph;
import Algorithms.Graph.WeightedGraphNode;

public class KruskalsAlgorithm {

    public void findMinimumSpanningTree(WeightedGraph graph) {

        System.out.println("        Minimum Spanning Tree: ");

        List<Edge> edgeList = new ArrayList<>();

        // Add the edges in a list
        for (WeightedGraphNode i: graph.nodeList) {
            for (Map.Entry<WeightedGraphNode, Integer> entry : i.connections.entrySet()) {
                edgeList.add(new Edge(i, entry.getKey() , entry.getValue()));
            }
        }

        // Sort the edges in the graph by weight
        edgeList.sort((e1, e2) -> Integer.compare(e1.weight, e2.weight));

        // Disjoint Set Union structure for Kruskal's
        Map<WeightedGraphNode, WeightedGraphNode> parent = new HashMap<>();
        for (WeightedGraphNode node : graph.nodeList) {
            parent.put(node, node); // initially, each node is its own parent
        }

        for (Edge edge : edgeList) {
            WeightedGraphNode root1 = find(parent, edge.startNode);
            WeightedGraphNode root2 = find(parent, edge.endNode);

            // If they are in different sets, add the edge to the MST and union them
            if (root1 != root2) {
                System.out.println("        " + edge.startNode.name + " - " + edge.endNode.name + " : " + edge.weight);
                parent.put(root1, root2); // union
            }
        }

        
    }
    
    private WeightedGraphNode find(Map<WeightedGraphNode, WeightedGraphNode> parent, WeightedGraphNode node) {
        if (parent.get(node) != node) {
            parent.put(node, find(parent, parent.get(node))); // path compression
        }
        return parent.get(node);
    }
    
}
