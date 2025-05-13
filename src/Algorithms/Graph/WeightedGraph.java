package Algorithms.Graph;

import java.util.List;

public class WeightedGraph {
    
    public List<WeightedGraphNode> nodeList;

    public WeightedGraph(List<WeightedGraphNode> nodeList) {
        this.nodeList = nodeList;
    }
    
    public void addEdge(WeightedGraphNode startNode, WeightedGraphNode endNode, int weight) {
        startNode.addConnection(endNode, weight);
    }

    public void removeEdge(WeightedGraphNode startNode, WeightedGraphNode endNode) {
        startNode.removeConnection(endNode);
    }
}
