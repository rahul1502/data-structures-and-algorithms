package DataStructures.Graph.Representation;

import java.util.List;

public class AdjacencyMatrix {

    public List<String> vertexList;
    public int[][] adjacencyMatrix;

    public AdjacencyMatrix(List<String> vertices) {
        this.vertexList = vertices;
        this.adjacencyMatrix = new int[vertices.size()][vertices.size()];
    }

    public void addEdge(String startVertex, String endVertex) {

        if(!vertexList.contains(startVertex) || !vertexList.contains(endVertex)) {
            System.out.println("Invalid input");
            return;
        }

        this.adjacencyMatrix[vertexList.indexOf(startVertex)][vertexList.indexOf(endVertex)] = 1;
        this.adjacencyMatrix[vertexList.indexOf(endVertex)][vertexList.indexOf(startVertex)] = 1;

    }

    public void removeEdge(String startVertex, String endVertex) {

        if(!vertexList.contains(startVertex) || !vertexList.contains(endVertex)) {
            System.out.println("Invalid input");
            return;
        }

        this.adjacencyMatrix[vertexList.indexOf(startVertex)][vertexList.indexOf(endVertex)] = 0;
        this.adjacencyMatrix[vertexList.indexOf(endVertex)][vertexList.indexOf(startVertex)] = 0;
    }
}
