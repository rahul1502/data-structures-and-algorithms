package Algorithms.ShortestPathAlgorithms;

import java.util.List;

public class WeightedGraph {

    public List<Vertex> vertexList;

    public WeightedGraph(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void addEdge(Vertex startVertex, Vertex endVertex, int weight) {
        startVertex.addConnection(endVertex, weight);
    }

    public void removeEdge(Vertex startVertex, Vertex endVertex) {
        startVertex.removeConnection(endVertex);
    }
}
