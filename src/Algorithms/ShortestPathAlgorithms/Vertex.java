package Algorithms.ShortestPathAlgorithms;

import java.util.HashMap;

public class Vertex {

    public String name;
    public HashMap<Vertex, Integer> connections;

    public Vertex(String name) {
        this.name = name;
        this.connections = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<Vertex, Integer> getConnections() {
        return connections;
    }

    public void addConnection(Vertex vertex, int weight) {
        this.connections.put(vertex, weight);
    }

    public void removeConnection(Vertex vertex) {
        this.connections.remove(vertex);
    }
}
