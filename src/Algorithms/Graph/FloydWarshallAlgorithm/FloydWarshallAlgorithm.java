package Algorithms.Graph.FloydWarshallAlgorithm;

public class FloydWarshallAlgorithm {

    public void floydWarshallAlgorithm(int[][] graph) {
        
        int V = graph.length; // number of graph nodes
        
        
        int[][] dist = new int[V][V];

        // Initialize the solution matrix
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        // Floyd-Warshall main loop
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        // Print the shortest distance matrix
        System.out.println("        Result: ");
        for (int i = 0; i < V; ++i) {
            System.out.print("            ");
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] >= 100000)
                    System.out.print("\u221E   ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }
    
}
