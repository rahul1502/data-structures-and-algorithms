package Algorithms.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    public String name;
    public List<GraphNode> connections;
    
    public GraphNode(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public void addConnection(GraphNode node) {
        connections.add(node);
    }

    public void removeConnection(GraphNode node) {
        connections.remove(node);
    }
}
