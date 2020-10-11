package DataStructures.Graph;

import DataStructures.Graph.Representation.AdjacencyList;
import DataStructures.Graph.Representation.AdjacencyMatrix;
import DataStructures.Graph.Representation.EdgeList;
import DataStructures.Graph.Representation.Vertex;
import java.util.ArrayList;

public class GraphRunner {

    public void run() {

        System.out.println("DataStructures.Graph: ");

        System.out.println("    Representation");

        System.out.println("    Vertices: [ A, B, C, D, E ,F ]");

        // Edge List
        EdgeList graph1 = new EdgeList(new ArrayList<String>() {{
            add("A"); add("B"); add("C"); add("D"); add("E"); add("F");
        }});

        graph1.addEdge("A", "B");graph1.addEdge("A", "D");graph1.addEdge("A", "C");
        graph1.addEdge("B", "D");graph1.addEdge("D", "E");graph1.addEdge("E", "F");
        graph1.addEdge("C", "F");graph1.addEdge("B", "E");graph1.removeEdge("B", "E");

        System.out.println("    Edge List: ");
        for(String[] edge: graph1.edgeList) {
            System.out.println("        " + edge[0] + " -> " + edge[1]);
        }

        // Adjacency Matrix
        AdjacencyMatrix graph2 = new AdjacencyMatrix(new ArrayList<String>() {{
            add("A"); add("B"); add("C"); add("D"); add("E"); add("F");
        }});

        graph2.addEdge("A", "B");graph2.addEdge("A", "D");graph2.addEdge("A", "C");
        graph2.addEdge("B", "D");graph2.addEdge("D", "E");graph2.addEdge("E", "F");
        graph2.addEdge("C", "F");graph2.addEdge("B", "E");graph2.removeEdge("B", "E");

        int[][] adjacencyMatrix = graph2.adjacencyMatrix;

        System.out.println("    Adjacency Matrix: ");
        for(int i=0; i < adjacencyMatrix.length; i++) {
            System.out.print("        ");
            for(int j=0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Adjacency List
        Vertex A = new Vertex("A"), B = new Vertex("B"), C = new Vertex("C"),
        D = new Vertex("D"), E = new Vertex("E"), F = new Vertex("F");

        AdjacencyList graph3 = new AdjacencyList(new ArrayList<Vertex>() {{
            add(A); add(B); add(C); add(D); add(E); add(F);
        }});

        graph3.addEdge(A, B); graph3.addEdge(A, C); graph3.addEdge(A, D); graph3.addEdge(B, D);
        graph3.addEdge(D, E); graph3.addEdge(E, F); graph3.addEdge(C, F); graph3.addEdge(B, E);
        graph3.removeEdge(B, E);

        System.out.println("    Adjacency List: ");
        for(Vertex i: graph3.vertexList) {
            System.out.print("        " + i.getName() + " : ");
            for(Vertex j: i.getConnections()) {
                System.out.print(j.getName() + " ");
            }
            System.out.println();
        }

    }

}
