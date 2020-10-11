package Algorithms.GraphTraversal;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    public String name;
    public List<Vertex> connections;

    public Vertex(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Vertex> getConnections() {
        return connections;
    }

    public void addConnection(Vertex vertex) {
        this.connections.add(vertex);
    }

    public void removeConnection(Vertex vertex) {
        this.connections.remove(vertex);
    }
}
