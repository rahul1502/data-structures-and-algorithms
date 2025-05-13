package Algorithms.Graph;

import java.util.HashMap;
import java.util.Map;

public class WeightedGraphNode {
    
    public String name;
    public Map<WeightedGraphNode, Integer> connections;

    public WeightedGraphNode(String name) {
        this.name = name;
        connections = new HashMap<>();
    }

    public void addConnection(WeightedGraphNode node, int weight) {
        connections.put(node, weight);
    }

    public void removeConnection(WeightedGraphNode node) {
        connections.remove(node);
    }

}
