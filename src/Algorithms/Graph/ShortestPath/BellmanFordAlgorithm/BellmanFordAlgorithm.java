package Algorithms.Graph.ShortestPath.BellmanFordAlgorithm;

import java.util.HashMap;
import java.util.Map;

import Algorithms.Graph.WeightedGraph;
import Algorithms.Graph.WeightedGraphNode;

public class BellmanFordAlgorithm {

    public Map<WeightedGraphNode, Integer> findShortestPath(WeightedGraph graph,
            WeightedGraphNode startNode) {
        
        Map<WeightedGraphNode, Integer> distBellmanFord = new HashMap<>();

        // Set initial values of distDijkstra to Infinite
        for (WeightedGraphNode node: graph.nodeList) {
            distBellmanFord.put(node, Integer.MAX_VALUE);
        }

        // Set distance from start node to start node to 0
        distBellmanFord.put(startNode, 0);

        printDistHeaders(distBellmanFord);
        for (int i = 0; i < (graph.nodeList.size() - 1) ; i++) {
            for (WeightedGraphNode from: graph.nodeList) {
                for (Map.Entry<WeightedGraphNode, Integer> to: from.connections.entrySet()) {
                    // Relax edges
                    if ((distBellmanFord.get(from) + to.getValue()) < distBellmanFord.get(to.getKey())) {
                        distBellmanFord.put(to.getKey(), (distBellmanFord.get(from) + to.getValue()));
                    }
                }
            }
        }

        printDistValues(distBellmanFord);

        return distBellmanFord;
    }

    private void printDistHeaders(Map<WeightedGraphNode, Integer> distBellmanFord) {
        System.out.println("        Shortest distances from A: ");
        System.out.print("            ");
        for(Map.Entry<WeightedGraphNode, Integer> i: distBellmanFord.entrySet()) {
            System.out.print(i.getKey().name + "    ");
        }
    }

    private void printDistValues(Map<WeightedGraphNode, Integer> distBellmanFord) {
        System.out.println();
        System.out.print("            ");
        for(Map.Entry<WeightedGraphNode, Integer> i: distBellmanFord.entrySet()) {

            if (i.getValue() == Integer.MAX_VALUE) {
                System.out.print("\u221E    ");
            }
            else if (i.getValue() == Integer.MIN_VALUE) {
                System.out.print("-\u221E    ");
            }
            else {
                System.out.print(i.getValue() + "    ");
            }
        }
    }
    
}
