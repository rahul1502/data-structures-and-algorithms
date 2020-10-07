import Algorithms.BinarySearch;
import DataStructures.Arrays.ArraysRunner;
import DataStructures.BinarySearchTree.BinarySearchTreeRunner;
import DataStructures.BinaryTree.BinaryTreeRunner;
import DataStructures.LinkedLists.LinkedListsRunner;
import DataStructures.Queue.QueueRunner;
import DataStructures.Stack.StackRunner;
import Problems.ExpressionParsing.ExpressionParsingRunner;

import java.util.Arrays;

public class Master {

    public static void main(String[] args) {

        System.out.println("--------------------------------------");

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
