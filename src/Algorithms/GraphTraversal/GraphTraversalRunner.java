package Algorithms.GraphTraversal;

import java.util.ArrayList;

public class GraphTraversalRunner {

    public void run() {

        System.out.println("Algorithms.GraphTraversal: ");

        // create graph
        System.out.println("    Vertices : [ A, B, C, D, E ,F, G, H, I, J, K, L, M ]");
        AdjacencyList graph = createGraph();
        System.out.println("    Graph: ");
        for(Vertex i: graph.vertexList) {
            System.out.print("        " + i.getName() + " : ");
            for(Vertex j: i.getConnections()) {
                System.out.print(j.getName() + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Algorithms.GraphTraversal.BreadthFirstTraversal
        BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal(graph.getVertexList().size());
        System.out.println("    Breadth-first search: ");
        breadthFirstTraversal.depthFirstTraversal(graph.getVertexList().get(0));

        System.out.println();
        // Algorithms.GraphTraversal.DepthFirstTraversal
        DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal(graph.getVertexList().size());
        System.out.println("    Depth-first search: ");
        depthFirstTraversal.depthFirstTraversal(graph.getVertexList().get(0));

    }


    private AdjacencyList createGraph() {

        Vertex A = new Vertex("A"), B = new Vertex("B"), C =  new Vertex("C"), D =  new Vertex("D"),
                E = new Vertex("E"), F = new Vertex("F"), G = new Vertex("G"), H = new Vertex("H"),
                I = new Vertex("I"), J = new Vertex("J"), K = new Vertex("K"), L = new Vertex("L"),
                M = new Vertex("M");

        AdjacencyList graph = new AdjacencyList(new ArrayList<Vertex>() {{
            add(A); add(B); add(C); add(D); add(E); add(F); add(G);
            add(H); add(I); add(J); add(K); add(L); add(M);
        }});

        // add edges
        graph.addEdge(A, J); graph.addEdge(A, H); graph.addEdge(A, L); graph.addEdge(B, K); graph.addEdge(B, I);
        graph.addEdge(C, M); graph.addEdge(C, D); graph.addEdge(D, E); graph.addEdge(G, H); graph.addEdge(G, F);
        graph.addEdge(H, D); graph.addEdge(H, L); graph.addEdge(I, M); graph.addEdge(I, J); graph.addEdge(J, K);

        return graph;
    }
}
