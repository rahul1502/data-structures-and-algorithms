package Algorithms.Graph.TopologicalSort.DFS;

import java.util.ArrayList;
import java.util.List;

import Algorithms.Graph.Graph;
import Algorithms.Graph.GraphNode;

public class TopologicalSortRunner {

    public void run() {
        
        // create graph
        System.out.println("    Vertices : [ A, B, C, D, E , F ]");
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


        (new TopologicalSort()).sort(graph);
    
    }

    private Graph createGraph() {
        GraphNode A = new GraphNode("A"), B = new GraphNode("B"), C =  new GraphNode("C"), D =  new GraphNode("D"),
                E = new GraphNode("E"), F = new GraphNode("F");

        Graph graph = new Graph(new ArrayList<GraphNode>() {{
            add(A); add(B); add(C); add(D); add(E); add(F);
        }});

        // add edges
        graph.addEdge(A, B);
        graph.addEdge(A, C);
        graph.addEdge(B, C);
        graph.addEdge(C, D);
        graph.addEdge(C, F);
        graph.addEdge(D, E);

        return graph;
    }
}
