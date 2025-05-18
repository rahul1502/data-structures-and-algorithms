package Algorithms.Graph.ShortestPath.FloydWarshallAlgorithm;

public class FloydWarshallAlgorithmRunner {

    public void run() {
        
        System.out.println("    Floyd Warshall Algorithm: ");

        // create graph
        // distance = 100000 i.e. no edge between the nodes
        int[][] graph = {
            {0, 4, 1, 100000},
            {100000, 0, 6, 100000},
            {4, 1, 0, 2},
            {100000, 100000, 100000, 0}
        };


        // Print initial Graph
        System.out.println("        Initial Graph: ");
        for (int i = 0; i < graph.length; ++i) {
            System.out.print("            ");
            for (int j = 0; j < graph.length; ++j) {
                if (graph[i][j] >= 100000)
                    System.out.print("\u221E   ");
                else
                    System.out.print(graph[i][j] + "   ");
            }
            System.out.println();
        }


        (new FloydWarshallAlgorithm()).floydWarshallAlgorithm(graph);
    }
    
}
