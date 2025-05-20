import Algorithms.Graph.ShortestPath.BellmanFordAlgorithm.BellmanFordAlgorithmRunner;
import Algorithms.Graph.ShortestPath.DijkstraShortestPathAlgorithm.DijkstraShortestPathAlgorithmRunner;
import Algorithms.Graph.ShortestPath.FloydWarshallAlgorithm.FloydWarshallAlgorithmRunner;
import Algorithms.Graph.TopologicalSort.DFS.TopologicalSort;
import Algorithms.Graph.TopologicalSort.DFS.TopologicalSortRunner;
import Algorithms.Graph.TopologicalSort.KahnsAlgorithm.KahnsAlgorithm;
import Algorithms.Graph.TopologicalSort.KahnsAlgorithm.KahnsAlgorithmRunner;
import Algorithms.Graph.MinimumSpanningTree.KruskalsAlgorithm.KruskalsAlgorithmRunner;
import Algorithms.Graph.MinimumSpanningTree.PrimsAlgorithm.PrimsAlgorithmRunner;
import Algorithms.Graph.Traversal.BFS.BFSTraversalRunner;
import Algorithms.Graph.Traversal.DFS.DFSTraversalRunner;
import Algorithms.ShortestPathAlgorithms.ShortestPathAlgorithmsRunner;
import Algorithms.SortingAlgorithms.SortingAlgorithmsRunner;
import DataStructures.AVLTree.AVLTreeRunner;
import DataStructures.Arrays.ArraysRunner;
import DataStructures.BinarySearchTree.BinarySearchTreeRunner;
import DataStructures.BinaryTree.BinaryTreeRunner;
import DataStructures.FenwickTree.FenwickTreeRunner;
import DataStructures.Graph.GraphRunner;
import DataStructures.LinkedLists.LinkedListsRunner;
import DataStructures.Queue.QueueRunner;
import DataStructures.Stack.StackRunner;
import DataStructures.Tries.TriesRunner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the code to run: ");

        System.out.println("Data Structures");
        System.out.println("    (1.1) Arrays");
        System.out.println("    (1.2) LinkedLists");
        System.out.println("    (1.3) Stack");
        System.out.println("    (1.4) Queue");
        System.out.println("    (1.5) BinaryTree");
        System.out.println("    (1.6) BinarySearchTree");
        System.out.println("    (1.7) Graph");
        System.out.println("    (1.8) FenwickTree");
        System.out.println("    (1.9) AVLTree");
        System.out.println("    (1.10) Tries");
        System.out.println("Algorithms");
        System.out.println("    (2) Graph");
        System.out.println("        (2.1) Traversal");
        System.out.println("            (2.1.1) Depth First Search (DFS)");
        System.out.println("            (2.1.2) Depth First Search (BFS)");
        System.out.println("        (2.2) Shortest Path Algorithms");
        System.out.println("            (2.2.1) Dijkstra's Shortest Path Algorithm");
        System.out.println("            (2.2.2) Bellman Ford Algorithm");
        System.out.println("            (2.2.3) Floyd Warshall Algorithm");
        System.out.println("        (2.3) Minimum Spanning Tree (MST) Algorithms");
        System.out.println("            (2.3.1) Prim's Algorithm");
        System.out.println("            (2.3.2) Kruskal's Algorithm");
        System.out.println("        (2.4) Topological Sort of DAG");
        System.out.println("            (2.4.1) Topological Sort - DFS");
        System.out.println("            (2.4.2) Topological Sort - Kahn's Algorithm");

        System.out.println("    (2.1) SortingAlgorithms");
        System.out.println("    (2.2) GraphTraversalRunner");
        System.out.println("    (2.3) ShortestPathAlgorithmsRunner");
        System.out.println("Problems");
        System.out.println("    (3.1) LinkedListsDetectCycleRunner");
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        switch (input) {
            case "1.1":
                System.out.println("Running DataStructures.Arrays");
                // DataStructures.Arrays
                (new ArraysRunner()).run();
                break;
            case "1.2":
                System.out.println("Running DataStructures.LinkedLists");
                // DataStructures.LinkedLists
                (new LinkedListsRunner()).run();
                break;
            case "1.3":
                System.out.println("Running DataStructures.Stack");
                // DataStructures.Stack
                (new StackRunner()).run();
                break;
            case "1.4":
                System.out.println("Running DataStructures.Queue");
                // DataStructures.Queue
                (new QueueRunner()).run();
                break;
            case "1.5":
                System.out.println("Running DataStructures.BinaryTree");
                // DataStructures.BinaryTree
                (new BinaryTreeRunner()).run();
                break;
            case "1.6":
                System.out.println("Running DataStructures.BinarySearchTree");
                // DataStructures.BinarySearchTree
                (new BinarySearchTreeRunner()).run();
                break;
            case "1.7":
                System.out.println("Running DataStructures.Graph");
                // DataStructures.Graph
                (new GraphRunner()).run();
                break;
            case "1.8":
                System.out.println("Running DataStructures.FenwickTree");
                // DataStructures.FenwickTree
                (new FenwickTreeRunner()).run();
                break;
            case "1.9":
                System.out.println("Running DataStructures.AVLTree");
                // DataStructures.AVLTreeRunner
                (new AVLTreeRunner()).run();
                break;
            case "1.10":
                System.out.println("Running DataStructures.Tries");
                // DataStructures.Tries
                (new TriesRunner()).run();
                break;
            case "2.1.1":
                System.out.println("Running Algorithms.Graph.Traversal.Depth First Search (DFS)");
                // Algorithms.SortingAlgorithms
                (new DFSTraversalRunner()).run();
                break;
            case "2.1.2":
                System.out.println("Running Algorithms.Graph.Traversal.Breadth First Search (BFS)");
                // Algorithms.SortingAlgorithms
                (new BFSTraversalRunner()).run();
                break;
            case "2.2.1":
                System.out.println("Running Algorithms.Graph.ShortestPath.DijkstraShortestPathAlgorithm");
                // Algorithms.Graph.ShortestPath.DijkstraShortestPathAlgorithm
                (new DijkstraShortestPathAlgorithmRunner()).run();
                break;
            case "2.2.2":
                System.out.println("Running Algorithms.Graph.ShortestPath.BellmanFordAlgorithm");
                // Algorithms.Graph.ShortestPath.BellmanFordAlgorithm
                (new BellmanFordAlgorithmRunner()).run();
                break;
            case "2.2.3":
                System.out.println("Running Algorithms.Graph.ShortestPath.FloydWarshallAlgorithm");
                // Algorithms.Graph.ShortestPath.FloydWarshallAlgorithm
                (new FloydWarshallAlgorithmRunner()).run();
                break;
            case "2.3.1":
                System.out.println("Running Algorithms.Graph.MinimumSpanningTree.PrimsAlgorithm");
                // Algorithms.Graph.MinimumSpanningTree.PrimsAlgorithm
                (new PrimsAlgorithmRunner()).run();
                break;
            case "2.3.2":
                System.out.println("Running Algorithms.Graph.MinimumSpanningTree.KruskalsAlgorithm");
                // Algorithms.Graph.MinimumSpanningTree.KruskalsAlgorithm
                (new KruskalsAlgorithmRunner()).run();
                break;
            case "2.4.1":
                System.out.println("Running Algorithms.Graph.TopologicalSort.DFS.TopologicalSort");
                // Algorithms.Graph.TopologicalSort.DFS.TopologicalSort
                (new TopologicalSortRunner()).run();
                break;
            case "2.4.2":
                System.out.println("Running Algorithms.Graph.TopologicalSort.DFS.TopologicalSort");
                // Algorithms.Graph.TopologicalSort
                (new KahnsAlgorithmRunner()).run();
                break;
            // case "2.1":
            //     System.out.println("Running Algorithms.SortingAlgorithms");
            //     // Algorithms.SortingAlgorithms
            //     (new SortingAlgorithmsRunner()).run();
            //     break;
            default:
                System.out.println("Unknown input");
        }

//
//        // Problems.ExpressionParsing
//        (new ExpressionParsingRunner()).run();
//

    }
}
