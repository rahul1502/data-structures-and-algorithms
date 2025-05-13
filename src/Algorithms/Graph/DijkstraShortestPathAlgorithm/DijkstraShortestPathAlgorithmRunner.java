package Algorithms.Graph.DijkstraShortestPathAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Algorithms.Graph.WeightedGraph;
import Algorithms.Graph.WeightedGraphNode;

public class DijkstraShortestPathAlgorithmRunner {

    public void run() {
        
        System.out.println("    Dijkstra's Shortest Path Algorithm: ");

        // create graph
        WeightedGraph graph = createGraph();
        System.out.println("        Graph [ A, B, C, D, E ,F ]: ");
        for(WeightedGraphNode i: graph.nodeList) {
            System.out.print("            " + i.name + " : ");
            for(Map.Entry<WeightedGraphNode, Integer> j: i.connections.entrySet()) {
                System.out.print(j.getKey().name + "[" + j.getValue() + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Dijkstra's Shortest Path Algorithm
        Map<WeightedGraphNode, Integer> distDijkstra = (new DijkstraShortestPathAlgorithm())
            .findShortestPath(graph, graph.nodeList.get(0));
    }

    

    private WeightedGraph createGraph() {

        WeightedGraphNode A = new WeightedGraphNode("A"), B = new WeightedGraphNode("B"), C = new WeightedGraphNode("C"),
                D = new WeightedGraphNode("D"), E = new WeightedGraphNode("E"), F = new WeightedGraphNode("F");

        WeightedGraph weightedGraph = new WeightedGraph(new ArrayList<WeightedGraphNode>() {{
            add(A); add(B); add(C); add(D); add(E); add(F);
        }});

        // add edges
        weightedGraph.addEdge(A, B, 5); weightedGraph.addEdge(A, C, 1); weightedGraph.addEdge(B, C, 2);
        weightedGraph.addEdge(B, D, 3); weightedGraph.addEdge(B, E, 20); weightedGraph.addEdge(C, B, 3);
        weightedGraph.addEdge(C, E, 12); weightedGraph.addEdge(D, C, 3); weightedGraph.addEdge(D, E, 2);
        weightedGraph.addEdge(D, F, 6); weightedGraph.addEdge(E, F, 1);

        return weightedGraph;
    }
    
}
