import Algorithms.Graph.DijkstraShortestPathAlgorithm.DijkstraShortestPathAlgorithmRunner;
import Algorithms.Graph.Traversal.BFS.BFSTraversalRunner;
import Algorithms.Graph.Traversal.DFS.DFSTraversalRunner;
import Algorithms.GraphTraversal.GraphTraversalRunner;
import Algorithms.ShortestPathAlgorithms.ShortestPathAlgorithmsRunner;
import Algorithms.SortingAlgorithms.SortingAlgorithmsRunner;
import DataStructures.AVLTree.AVLTreeRunner;
import DataStructures.Arrays.ArraysRunner;
import DataStructures.BinarySearchTree.BinarySearchTreeRunner;
import DataStructures.BinaryTree.BinaryTreeRunner;
import DataStructures.FenwickTree.FenwickTree;
import DataStructures.FenwickTree.FenwickTreeRunner;
import DataStructures.Graph.GraphRunner;
import DataStructures.LinkedLists.LinkedListsRunner;
import DataStructures.Queue.QueueRunner;
import DataStructures.Stack.StackRunner;
import DataStructures.Tries.TriesRunner;
import Problems.LinkedListsDetectCycle.LinkedListsDetectCycleRunner;

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
        System.out.println("        (2.2) Dijkstra's Shortest Path Algorithm");


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
            case "2.2":
                System.out.println("Running Algorithms.Graph.DijkstraShortestPathAlgorithm");
                // Algorithms.Graph.DijkstraShortestPathAlgorithm
                (new DijkstraShortestPathAlgorithmRunner()).run();
                break;
            // case "2.1":
            //     System.out.println("Running Algorithms.SortingAlgorithms");
            //     // Algorithms.SortingAlgorithms
            //     (new SortingAlgorithmsRunner()).run();
            //     break;
            // case "2.2":
            //     System.out.println("Running Algorithms.GraphTraversalRunner");
            //     // Algorithms.GraphTraversalRunner
            //     (new GraphTraversalRunner()).run();
            //     break;
            
            
            // case "3.1":
            //     System.out.println("Running Problems.LinkedListsDetectCycleRunner");
            //     // Problems.LinkedListsDetectCycleRunner
            //     (new LinkedListsDetectCycleRunner()).run();
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
