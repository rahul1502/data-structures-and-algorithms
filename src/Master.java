import Algorithms.BinarySearch;
import DataStructures.Arrays.ArraysRunner;
import DataStructures.Arrays.DynamicArray;
import DataStructures.Arrays.StaticArray;
import DataStructures.LinkedLists.LinkedListsRunner;
import DataStructures.Trees.TreesRunner;

import java.util.Arrays;

public class Master {

    public static void main(String[] args) {

        // DataStructures.Arrays
        (new ArraysRunner()).run();

        // DataStructures.LinkedLists
        (new LinkedListsRunner()).run();




        // DataStructures.Trees
        (new TreesRunner()).run();


        // do Binary Search
        System.out.print("Binary Search: ");
        int[] arr = {-2, 3, 4, 7, 8, 9, 11, 13, 25, 27, 33, 42, 49, 56, 59, 63, 78, 89, 99};
        (new BinarySearch()).doBinarySearch(arr, 33);
    }
}
