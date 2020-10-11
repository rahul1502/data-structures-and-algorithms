import Algorithms.BinarySearch;
import Algorithms.BinaryTreeTraversal.BinaryTreeTraversalRunner;
import Algorithms.GraphTraversal.GraphTraversalRunner;
import DataStructures.Arrays.ArraysRunner;
import DataStructures.BinarySearchTree.BinarySearchTreeRunner;
import DataStructures.BinaryTree.BinaryTreeRunner;
import DataStructures.Graph.GraphRunner;
import DataStructures.LinkedLists.LinkedListsRunner;
import DataStructures.Queue.QueueRunner;
import DataStructures.Stack.StackRunner;
import Problems.ExpressionParsing.ExpressionParsingRunner;

import java.util.Arrays;

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

        // Algorithms.BinaryTreeTraversal
        (new BinaryTreeTraversalRunner()).run();

        System.out.println("--------------------------------------");

        // Algorithms.GraphTraversalRunner
        (new GraphTraversalRunner()).run();
        System.out.println("--------------------------------------");

//
//        // Problems.ExpressionParsing
//        (new ExpressionParsingRunner()).run();
//
//        System.out.println("--------------------------------------");
//
//        // do Binary Search
//        System.out.print("Binary Search: ");
//        int[] arr = {-2, 3, 4, 7, 8, 9, 11, 13, 25, 27, 33, 42, 49, 56, 59, 63, 78, 89, 99};
//        (new BinarySearch()).doBinarySearch(arr, 33);
    }
}
