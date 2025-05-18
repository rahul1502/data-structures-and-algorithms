package Algorithms.Graph.ShortestPath.BellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Algorithms.Graph.WeightedGraph;
import Algorithms.Graph.WeightedGraphNode;

public class BellmanFordAlgorithmRunner {

    public void run() {
        
        // Algorithms.ShortestPathAlgorithms.BellmanFordAlgorithm
        System.out.println("    Bellman-Ford Algorithm: ");
        // create graph
        WeightedGraph graph = createGraph();
        System.out.println("        Graph [ A, B, C, D, E ,F, G ]: ");
        for(WeightedGraphNode i: graph.nodeList) {
            System.out.print("            " + i.name + " : ");
            for(Map.Entry<WeightedGraphNode, Integer> j: i.connections.entrySet()) {
                System.out.print(j.getKey().name + "[" + j.getValue() + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();

        (new BellmanFordAlgorithm()).findShortestPath(graph, graph.nodeList.get(0));
    }

    private WeightedGraph createGraph() {
        WeightedGraphNode A = new WeightedGraphNode("A"), B = new WeightedGraphNode("B"), C = new WeightedGraphNode("C"),
                D = new WeightedGraphNode("D"), E = new WeightedGraphNode("E"), F = new WeightedGraphNode("F"),
                G = new WeightedGraphNode("G");

        WeightedGraph weightedGraph = new WeightedGraph(new ArrayList<WeightedGraphNode>() {{
            add(A); add(B); add(C); add(D); add(E); add(F); add(G);
        }});

        // add edges
        weightedGraph.addEdge(A, B, 4); weightedGraph.addEdge(A, G, 2);
        weightedGraph.addEdge(B, B, -1); weightedGraph.addEdge(B, C, 3);
        weightedGraph.addEdge(C, D, 3); weightedGraph.addEdge(C, E, 1);
        weightedGraph.addEdge(D, F, -2);
        weightedGraph.addEdge(E, F, 2);
        weightedGraph.addEdge(G, E, 2);

        return weightedGraph;
    }
    
}
