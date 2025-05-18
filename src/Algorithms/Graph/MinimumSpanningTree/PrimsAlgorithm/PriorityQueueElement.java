package Algorithms.Graph.MinimumSpanningTree.PrimsAlgorithm;

import Algorithms.Graph.WeightedGraphNode;

public class PriorityQueueElement {

    WeightedGraphNode sourceNode;
    WeightedGraphNode destNode;
    int weight;

    public PriorityQueueElement(WeightedGraphNode sourceNode, WeightedGraphNode destNode, int weight) {
        this.sourceNode = sourceNode;
        this.destNode = destNode;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[" + sourceNode.name + ", " + destNode.name + ", " + weight + "]";
    }
    
}
