package Algorithms.ShortestPathAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShortestPathAlgorithmsRunner {

    public void run() {

        System.out.println("Algorithms.ShortestPathAlgorithms: ");

        // Algorithms.ShortestPathAlgorithms.DijkstraShortestPathAlgorithm
        System.out.println("    Dijkstra's Shortest Path Algorithm: ");
        // create graph
        WeightedGraph graph1 = createGraph1();
        System.out.println("        Graph [ A, B, C, D, E ,F ]: ");
        for(Vertex i: graph1.vertexList) {
            System.out.print("            " + i.getName() + " : ");
            for(Map.Entry<Vertex, Integer> j: i.getConnections().entrySet()) {
                System.out.print(j.getKey().getName() + "[" + j.getValue() + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();

        HashMap<Vertex, Integer> distDijkstra =
                (new DijkstraShortestPathAlgorithm()).findShortestPath(graph1, graph1.getVertexList().get(0));

        System.out.println("        Shortest distances from A: ");
        for(Map.Entry<Vertex, Integer> i: distDijkstra.entrySet()) {
            System.out.println("            " + i.getKey().getName() + ": " + i.getValue());
        }
        System.out.println();

        // Algorithms.ShortestPathAlgorithms.BellmanFordAlgorithm
        System.out.println("    Bellman-Ford Algorithm: ");
        // create graph
        WeightedGraph graph2 = createGraph2();
        System.out.println("        Graph [ A, B, C, D, E ,F, G ]: ");
        for(Vertex i: graph2.vertexList) {
            System.out.print("            " + i.getName() + " : ");
            for(Map.Entry<Vertex, Integer> j: i.getConnections().entrySet()) {
                System.out.print(j.getKey().getName() + "[" + j.getValue() + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();

        HashMap<Vertex, Integer> distBellmamn =
                (new BellmanFordAlgorithm()).findShortestPath(graph2, graph2.getVertexList().get(0));
        System.out.println("        Shortest distances from A: ");
        for(Map.Entry<Vertex, Integer> i: distBellmamn.entrySet()) {
            System.out.println("            " + i.getKey().getName() + ": " + i.getValue());
        }
        System.out.println();
    }

    private WeightedGraph createGraph1() {

        Vertex A = new Vertex("A"), B = new Vertex("B"), C = new Vertex("C"),
                D = new Vertex("D"), E = new Vertex("E"), F = new Vertex("F");

        WeightedGraph weightedGraph = new WeightedGraph(new ArrayList<Vertex>() {{
            add(A); add(B); add(C); add(D); add(E); add(F);
        }});

        // add edges
        weightedGraph.addEdge(A, B, 5); weightedGraph.addEdge(A, C, 1); weightedGraph.addEdge(B, C, 2);
        weightedGraph.addEdge(B, D, 3); weightedGraph.addEdge(B, E, 20); weightedGraph.addEdge(C, B, 3);
        weightedGraph.addEdge(C, E, 12); weightedGraph.addEdge(D, C, 3); weightedGraph.addEdge(D, E, 2);
        weightedGraph.addEdge(D, F, 6); weightedGraph.addEdge(E, F, 1);

        return weightedGraph;
    }

    private WeightedGraph createGraph2() {

        Vertex A = new Vertex("A"), B = new Vertex("B"), C = new Vertex("C"),
                D = new Vertex("D"), E = new Vertex("E"), F = new Vertex("F"),
                G = new Vertex("G");

        WeightedGraph weightedGraph = new WeightedGraph(new ArrayList<Vertex>() {{
            add(A); add(B); add(C); add(D); add(E); add(F); add(G);
        }});

        // add edges
        weightedGraph.addEdge(A, B, 6);
        weightedGraph.addEdge(A, C, 5);
        weightedGraph.addEdge(A, D, 5);
        weightedGraph.addEdge(B, E, -1);
        weightedGraph.addEdge(C, B, -2);
        weightedGraph.addEdge(C, E, 1);
        weightedGraph.addEdge(D, C, -2);
        weightedGraph.addEdge(D, F, -1);
        weightedGraph.addEdge(E, G, 3);
        weightedGraph.addEdge(F, G, 3);

        return weightedGraph;
    }
}
