package Algorithms.Graph.Traversal.BFS;

import java.util.ArrayList;
import java.util.List;

import Algorithms.Graph.GraphNode;

public class BFSTraversal {
    
    private Queue queue;

    public BFSTraversal() {
        queue = new Queue();
    }

    public List<GraphNode> breadthFirstSearchTraversal(GraphNode startNode) {

        List<GraphNode> visitedNodes = new ArrayList<>();
        
        queue.enQueue(startNode);
        GraphNode currentNode;

        while (!queue.isEmpty()) {

            currentNode = queue.deQueue();
            if (!visitedNodes.contains(currentNode)) {
                visitedNodes.add(currentNode);

                for (GraphNode  i: currentNode.connections) {
                    if (!queue.queue.contains(i)) {
                        queue.enQueue(i);
                    }
                }
            }
            printStatus(visitedNodes); 
        }

        return visitedNodes;
    }

    private void printStatus(List<GraphNode> visitedNodes) {
        System.out.print("        Traversed: ");
        for(GraphNode i: visitedNodes) {
            System.out.print(i.name + " ");
        }
        System.out.print(" Queue: ");
        for(GraphNode i: queue.queue) {
            System.out.print(i.name + " ");
        }
        System.out.println();
    }
}
