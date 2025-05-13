package Algorithms.Graph;

import java.util.List;

public class Graph {

    public List<GraphNode> nodeList;

    public Graph(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addEdge(GraphNode startNode, GraphNode endNode) {
        startNode.addConnection(endNode);
        endNode.addConnection(startNode);
    }

    public void removeEdge(GraphNode startNode, GraphNode endNode) {
        startNode.removeConnection(endNode);
        endNode.removeConnection(startNode);
    }
}
