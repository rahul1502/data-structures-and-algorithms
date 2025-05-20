package Algorithms.Graph.TopologicalSort.KahnsAlgorithm;

import java.util.ArrayList;

import Algorithms.Graph.Graph;
import Algorithms.Graph.GraphNode;
import Algorithms.Graph.Traversal.DFS.DFSTraversal;

public class KahnsAlgorithmRunner {

    public void run() {
        
        // create graph
        System.out.println("    Vertices : [ A, B, C, D, E ,F, G, H, I, J, K, L, M, N ]");
        Graph graph = createGraph();
        System.out.println("    Graph: ");
        for(GraphNode i: graph.nodeList) {
            System.out.print("        " + i.name + " : ");
            for(GraphNode j: i.connections) {
                System.out.print(j.name + " ");
            }
            System.out.println();
        }
        System.out.println();


        // Topological Sort using Kahn's Algorithm
        (new KahnsAlgorithm()).sort(graph);  
    }

    private Graph createGraph() {
        GraphNode A = new GraphNode("A"), B = new GraphNode("B"), C =  new GraphNode("C"), D =  new GraphNode("D"),
                E = new GraphNode("E"), F = new GraphNode("F"), G = new GraphNode("G"), H = new GraphNode("H"),
                I = new GraphNode("I"), J = new GraphNode("J"), K = new GraphNode("K"), L = new GraphNode("L"),
                M = new GraphNode("M"), N = new GraphNode("N");

        Graph graph = new Graph(new ArrayList<GraphNode>() {{
            add(A); add(B); add(C); add(D); add(E); add(F); add(G);
            add(H); add(I); add(J); add(K); add(L); add(M); add(N);
        }});

        // add edges

        A.addConnection(C);
        A.addConnection(D);
        A.addConnection(G);
        B.addConnection(E);
        C.addConnection(G);
        D.addConnection(B);
        D.addConnection(E);
        E.addConnection(F);
        E.addConnection(I);
        G.addConnection(H);
        G.addConnection(L);
        H.addConnection(E);
        H.addConnection(M);
        J.addConnection(C);
        J.addConnection(K);
        K.addConnection(G);
        L.addConnection(M);
        M.addConnection(I);

        return graph;
    }
    
}
