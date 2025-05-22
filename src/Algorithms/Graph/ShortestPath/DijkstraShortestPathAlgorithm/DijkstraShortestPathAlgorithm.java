package Algorithms.Graph.ShortestPath.DijkstraShortestPathAlgorithm;

import java.util.HashMap;
import java.util.Map;

import Algorithms.Graph.WeightedGraph;
import Algorithms.Graph.WeightedGraphNode;

public class DijkstraShortestPathAlgorithm {

    public Map<WeightedGraphNode, Integer> priorityQueue;

    public DijkstraShortestPathAlgorithm() {
        priorityQueue = new HashMap<>();
    }

    // Dijkstra's Shortest Path Algorithm
    public Map<WeightedGraphNode, Integer> findShortestPath(WeightedGraph graph, WeightedGraphNode startNode) {
        
        Map<WeightedGraphNode, Integer> distDijkstra = new HashMap<>();

        // Set initial values of distDijkstra to Infinite
        for (WeightedGraphNode node: graph.nodeList) {
            distDijkstra.put(node, Integer.MAX_VALUE);
        }

        // Set distance from start node to start node to 0
        distDijkstra.put(startNode, 0);
        priorityQueue.put(startNode, 0);

        printDistHeaders(distDijkstra);

        while (priorityQueue.size() > 0) {

            printDistValues(distDijkstra);

            Map.Entry<WeightedGraphNode, Integer> highestPriorityElement =  getHighestPriorityElement();
            priorityQueue.remove(highestPriorityElement.getKey());

            for (Map.Entry<WeightedGraphNode, Integer> entry: 
                highestPriorityElement.getKey().connections.entrySet()){
                
                    if ((highestPriorityElement.getValue() + entry.getValue()) < distDijkstra.get(entry.getKey())) {
                        distDijkstra.put(entry.getKey(), (highestPriorityElement.getValue() + entry.getValue()));
                        priorityQueue.put(entry.getKey(), (highestPriorityElement.getValue() + entry.getValue()));
                    }

            }
        }

        return distDijkstra;
    }

    private Map.Entry<WeightedGraphNode, Integer> getHighestPriorityElement() {
        return priorityQueue.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .findFirst()
                    .orElse(null);
    }

    private void printDistHeaders(Map<WeightedGraphNode, Integer> distDijkstra) {
        System.out.println("        Shortest distances from A: ");
        System.out.print("            ");
        for(Map.Entry<WeightedGraphNode, Integer> i: distDijkstra.entrySet()) {
            System.out.print(i.getKey().name + "    ");
        }
    }

    private void printDistValues(Map<WeightedGraphNode, Integer> distDijkstra) {
        System.out.println();
        System.out.print("            ");
        for(Map.Entry<WeightedGraphNode, Integer> i: distDijkstra.entrySet()) {
            System.out.print(((i.getValue() == Integer.MAX_VALUE) ? "\u221E" : i.getValue()) + "    ");
        }
    }

}
