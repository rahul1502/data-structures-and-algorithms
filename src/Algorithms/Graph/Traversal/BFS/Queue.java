package Algorithms.Graph.Traversal.BFS;

import java.util.ArrayList;
import java.util.List;

import Algorithms.Graph.GraphNode;

public class Queue {

    public List<GraphNode> queue;
    
    public Queue() {
        queue = new ArrayList<>();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void enQueue(GraphNode node) {
        queue.add(node);
    }

    public GraphNode deQueue() {
        GraphNode firstNode = queue.get(0);
        queue.remove(0);
        
        return firstNode;
    }

    public GraphNode peek() {
        return queue.get(0);
    }

}
