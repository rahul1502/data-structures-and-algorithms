package Algorithms.Graph.MinimumSpanningTree.PrimsAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Algorithms.Graph.WeightedGraph;
import Algorithms.Graph.WeightedGraphNode;

public class PrimsAlgorithm {

    public Map<WeightedGraphNode, PriorityQueueElement> priorityQueue;

    public PrimsAlgorithm() {
        priorityQueue = new HashMap<>();
    }

    public void findMinimumSpanningTree(WeightedGraph graph, WeightedGraphNode startNode) {

        List<WeightedGraphNode> visitedNodes = new ArrayList<>();

        System.out.println("        Minimum Spanning Tree: ( Start Node " + startNode.name + " )");
        
        // Add the start element's connected edges to startNode
        for (Map.Entry<WeightedGraphNode, Integer> edge : startNode.connections.entrySet()) {
            priorityQueue.put(edge.getKey(), new PriorityQueueElement(startNode, edge.getKey(), edge.getValue()));
        }
        visitedNodes.add(startNode);
        printVisitedNodes(visitedNodes);

        
        while (priorityQueue.size() > 0) {
            Map.Entry<WeightedGraphNode, PriorityQueueElement> visitedNode = getHighestPriorityElement();

            System.out.println("              Visiting Node - " + visitedNode.getKey().name);
            System.out.println("              MST: " + visitedNode.getValue().sourceNode.name + " -> " + 
                visitedNode.getValue().destNode.name + " [ " + visitedNode.getValue().weight + " ]");


            for (Map.Entry<WeightedGraphNode, Integer> edge : visitedNode.getKey().connections.entrySet()) {
                if ((!priorityQueue.containsKey(edge.getKey()) && !visitedNodes.contains(edge.getKey())) ||
                    (priorityQueue.containsKey(edge.getKey()) && edge.getValue() < priorityQueue.get(edge.getKey()).weight)) {   
                    priorityQueue.put(edge.getKey(), new PriorityQueueElement(visitedNode.getKey(), edge.getKey(), edge.getValue()));
                    System.out.println("                Add to PQ - " + edge.getKey().name + " -> ( " + visitedNode.getKey().name + " , " + edge.getKey().name + " , " + edge.getValue() + " )");
                }
            }

            priorityQueue.remove(visitedNode.getKey());
            System.out.println("              Remove from PQ - " + visitedNode.getKey().name);
            visitedNodes.add(visitedNode.getKey());

            printVisitedNodes(visitedNodes);
            System.out.println("              ---");
        }

    }

    private Map.Entry<WeightedGraphNode, PriorityQueueElement> getHighestPriorityElement() {
        return priorityQueue.entrySet().stream()
                    .min(Comparator.comparing(entry -> entry.getValue().weight))
                    .orElse(null);
    }

    private void printVisitedNodes(List<WeightedGraphNode> visitedNodes) {
        System.out.print("              Visited Nodes - ");
        for (WeightedGraphNode i: visitedNodes) {
            System.out.print(i.name + " , ");
        }
        System.out.println();
    }
    
}
