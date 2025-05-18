package Algorithms.Graph.MinimumSpanningTree.KruskalsAlgorithm;

import java.util.ArrayList;
import java.util.Map;

import Algorithms.Graph.WeightedGraph;
import Algorithms.Graph.WeightedGraphNode;

public class KruskalsAlgorithmRunner {

    public void run() {
        
        System.out.println("    Kruskal's Minimum Spanning Tree Algorithm: ");
        // create graph
        WeightedGraph graph = createGraph();
        System.out.println("        Graph [ A, B, C, D, E ,F, G ]: ");
        for(WeightedGraphNode i: graph.nodeList) {
            System.out.print("            " + i.name + " : ");
            for(Map.Entry<WeightedGraphNode, Integer> j: i.connections.entrySet()) {
                System.out.print(j.getKey().name + "[" + j.getValue() + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Kruskal's Minimum Spanning Tree Algorithm:
        (new KruskalsAlgorithm()).findMinimumSpanningTree(graph);
    }

    private WeightedGraph createGraph() {

        WeightedGraphNode A = new WeightedGraphNode("A"), B = new WeightedGraphNode("B"), C = new WeightedGraphNode("C"),
                D = new WeightedGraphNode("D"), E = new WeightedGraphNode("E"), F = new WeightedGraphNode("F"), G = new WeightedGraphNode("G");

        WeightedGraph weightedGraph = new WeightedGraph(new ArrayList<WeightedGraphNode>() {{
            add(A); add(B); add(C); add(D); add(E); add(F); add(G);
        }});

        // add edges
        weightedGraph.addEdge(A, B, 9); weightedGraph.addEdge(A, D, 5); weightedGraph.addEdge(A, F, 7); weightedGraph.addEdge(A, C, 0); 
        weightedGraph.addEdge(B, A, 9); weightedGraph.addEdge(B, D, -2); weightedGraph.addEdge(B, G, 4); weightedGraph.addEdge(B, E, 3);
        weightedGraph.addEdge(C, A, 0); weightedGraph.addEdge(C, F, 6);
        weightedGraph.addEdge(D, A, 5); weightedGraph.addEdge(D, B, -2); weightedGraph.addEdge(D, G, 3); weightedGraph.addEdge(D, F, 2);
        weightedGraph.addEdge(E, B, 3); weightedGraph.addEdge(E, G, 6);
        weightedGraph.addEdge(F, C, 6); weightedGraph.addEdge(F, A, 7); weightedGraph.addEdge(F, D, 2); weightedGraph.addEdge(F, G, 1);
        weightedGraph.addEdge(G, F, 1); weightedGraph.addEdge(G, D, 3); weightedGraph.addEdge(G, B, 4); weightedGraph.addEdge(G, E, 6);

        return weightedGraph;
    }
    
}
