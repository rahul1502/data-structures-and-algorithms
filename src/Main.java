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
        System.out.println("    (2.1) SortingAlgorithms");
        System.out.println("    (2.2) BinaryTreeTraversal");
        System.out.println("    (2.3) GraphTraversalRunner");
        System.out.println("    (2.4) ShortestPathAlgorithmsRunner");
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
            case "2.1":
                System.out.println("Running Algorithms.SortingAlgorithms");
                // Algorithms.SortingAlgorithms
                (new SortingAlgorithmsRunner()).run();
                break;
            case "2.2":
                System.out.println("Running Algorithms.GraphTraversalRunner");
                // Algorithms.GraphTraversalRunner
                (new GraphTraversalRunner()).run();
                break;
            case "2.3":
                System.out.println("Running Algorithms.ShortestPathAlgorithmsRunner");
                // Algorithms.ShortestPathAlgorithmsRunner
                (new ShortestPathAlgorithmsRunner()).run();
                break;
            case "3.1":
                System.out.println("Running Problems.LinkedListsDetectCycleRunner");
                // Problems.LinkedListsDetectCycleRunner
                (new LinkedListsDetectCycleRunner()).run();
                break;
            default:
                System.out.println("Unknown input");
        }

//
//        // Problems.ExpressionParsing
//        (new ExpressionParsingRunner()).run();
//

    }
}
