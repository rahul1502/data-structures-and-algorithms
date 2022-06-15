import Algorithms.BinaryTreeTraversal.BinaryTreeTraversalRunner;
import Algorithms.GraphTraversal.GraphTraversalRunner;
import Algorithms.ShortestPathAlgorithms.ShortestPathAlgorithmsRunner;
import Algorithms.SortingAlgorithms.SortingAlgorithmsRunner;
import DataStructures.Arrays.ArraysRunner;
import DataStructures.BinarySearchTree.BinarySearchTreeRunner;
import DataStructures.BinaryTree.BinaryTreeRunner;
import DataStructures.Graph.GraphRunner;
import DataStructures.LinkedLists.LinkedListsRunner;
import DataStructures.Queue.QueueRunner;
import DataStructures.Stack.StackRunner;
import Problems.LinkedListsDetectCycle.LinkedListsDetectCycleRunner;

public class Master {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("*******    Data Structures    *******");
        System.out.println("--------------------------------------------------------------------");

        // DataStructures.Arrays
        (new ArraysRunner()).run();
        System.out.println("--------------------------------------");

        // DataStructures.LinkedLists
        (new LinkedListsRunner()).run();
        System.out.println("--------------------------------------");

        // DataStructures.Stack
        (new StackRunner()).run();
        System.out.println("--------------------------------------");

        // DataStructures.Queue
        (new QueueRunner()).run();
        System.out.println("--------------------------------------");

        // DataStructures.BinaryTree
        (new BinaryTreeRunner()).run();
        System.out.println("--------------------------------------");

        // DataStructures.BinarySearchTree
        (new BinarySearchTreeRunner()).run();
        System.out.println("--------------------------------------");

        // DataStructures.Graph
        (new GraphRunner()).run();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("**********    Algorithms    **********");
        System.out.println("--------------------------------------------------------------------");

        // SortingAlgorithms.SortingAlgorithms
        (new SortingAlgorithmsRunner()).run();
        System.out.println("--------------------------------------");

        // Algorithms.BinaryTreeTraversal
        (new BinaryTreeTraversalRunner()).run();
        System.out.println("--------------------------------------");

        // Algorithms.GraphTraversalRunner
        (new GraphTraversalRunner()).run();
        System.out.println("--------------------------------------");

        // Algorithms.ShortestPathAlgorithmsRunner
        (new ShortestPathAlgorithmsRunner()).run();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("**********    Problems    **********");
        System.out.println("--------------------------------------------------------------------");

//
//        // Problems.ExpressionParsing
//        (new ExpressionParsingRunner()).run();
//
        // Problems.LinkedListsDetectCycleRunner
        (new LinkedListsDetectCycleRunner()).run();
    }
}
