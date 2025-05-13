package Algorithms.Graph.Traversal.DFS;

import java.util.ArrayList;

import Algorithms.Graph.Graph;
import Algorithms.Graph.GraphNode;

public class DFSTraversalRunner {

    public void run() {
        
        // create graph
        System.out.println("    Vertices : [ A, B, C, D, E ,F, G, H, I, J, K, L, M ]");
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


        // Depth First Traversal
        DFSTraversal dfsTraversal = new DFSTraversal();
        dfsTraversal.depthFirstSearchTraversal(graph.nodeList.get(0));
    }

    private Graph createGraph() {
        GraphNode A = new GraphNode("A"), B = new GraphNode("B"), C =  new GraphNode("C"), D =  new GraphNode("D"),
                E = new GraphNode("E"), F = new GraphNode("F"), G = new GraphNode("G"), H = new GraphNode("H"),
                I = new GraphNode("I"), J = new GraphNode("J"), K = new GraphNode("K"), L = new GraphNode("L"),
                M = new GraphNode("M");

        Graph graph = new Graph(new ArrayList<GraphNode>() {{
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
