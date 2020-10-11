package Algorithms.GraphTraversal;

import java.util.List;

public class Graph {

    public List<Vertex> vertexList;

    public Graph(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void addEdge(Vertex startVertex, Vertex endVertex) {
        startVertex.addConnection(endVertex);
        endVertex.addConnection(startVertex);
    }

    public void removeEdge(Vertex startVertex, Vertex endVertex) {
        startVertex.removeConnection(endVertex);
        endVertex.removeConnection(startVertex);
    }

}
