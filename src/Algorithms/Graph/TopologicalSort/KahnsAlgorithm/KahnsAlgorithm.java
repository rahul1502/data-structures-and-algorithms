package Algorithms.Graph.TopologicalSort.KahnsAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import Algorithms.Graph.Graph;
import Algorithms.Graph.GraphNode;

public class KahnsAlgorithm {

    private Queue<GraphNode> queue = new LinkedList<>();
    private Map<GraphNode, Integer> inDegree = new HashMap<>();

    public void sort(Graph graph) {
        
        System.out.println("        Topological Sort using Kahn's Algorithm: ");

        System.out.println("            Initial Node in-degrees ");
        // Calculate node indegrees
        for (GraphNode node: graph.nodeList) {

            node.connections.stream().forEach( n -> {
                inDegree.put(n, (inDegree.get(n) == null) ? 1 : (inDegree.get(n) + 1));
            });  

            if (inDegree.get(node) == null) {
                inDegree.put(node, 0);
            } 
        }

        inDegree.entrySet().stream()
            .sorted((e1, e2) -> e1.getKey().name.compareTo(e2.getKey().name))
            .forEach(entry -> {
                System.out.println("                " + entry.getKey().name + " -> " + entry.getValue());
            });
        
        // Add the nodes with indegree 0 to queue
        for (Map.Entry<GraphNode, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                queue.add(entry.getKey());
            }
        }

        List<GraphNode> topologicalOrder = new ArrayList<>();
        while (queue.size() != 0) {

            GraphNode n = queue.remove();
            topologicalOrder.add(n);

            // Update inDegree after removal of the node n
            n.connections.stream().forEach( i -> {
                inDegree.put(i, (inDegree.get(i) == 0) ? 0 : (inDegree.get(i) - 1));
            }); 
            

            // Add new nodes with in-degree 0 to inDegree
            n.connections.stream().forEach( i -> {
                if (inDegree.get(i) == 0) {
                    queue.add(i);
                }
            }); 

        }

        System.out.println("            Topological ordering ");
        System.out.print("                [ ");
        for (GraphNode i : topologicalOrder) {
            System.out.print(i.name + " ");
        }
        System.out.print("]");

    }  
}
