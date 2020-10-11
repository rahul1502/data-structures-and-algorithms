package DataStructures.Graph.Representation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EdgeList {

    public List<String> vertexList;
    public List<String[]> edgeList;

    public EdgeList(List<String> vertices) {
        this.vertexList = vertices;
        this.edgeList = new ArrayList<>();
    }

    public void addEdge(String startVertex, String endVertex) {

        if(!vertexList.contains(startVertex) || !vertexList.contains(endVertex)) {
            System.out.println("Invalid input");
            return;
        }

        this.edgeList.add(new String[] {startVertex, endVertex});
    }

    public void removeEdge(String startVertex, String endVertex) {
        if(!vertexList.contains(startVertex) || !vertexList.contains(endVertex)) {
            System.out.println("Invalid input");
            return;
        }

        this.edgeList.removeIf(edge -> Arrays.deepEquals(edge, new String[] {startVertex, endVertex}));
    }

}
