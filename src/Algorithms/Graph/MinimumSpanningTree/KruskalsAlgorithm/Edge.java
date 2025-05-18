package Algorithms.Graph.MinimumSpanningTree.KruskalsAlgorithm;

import Algorithms.Graph.WeightedGraphNode;

public class Edge {

    WeightedGraphNode startNode;
    WeightedGraphNode endNode;
    int weight;

    public Edge(WeightedGraphNode startNode, WeightedGraphNode endNode, int weight) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
    }
    
}
