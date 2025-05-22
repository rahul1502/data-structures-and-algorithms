package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorithmsRunner {

    int[] array;

    public SortingAlgorithmsRunner() {
        // create array
        array = new int[] {3, 5, -4, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45};

        System.out.println("    Array: " + Arrays.toString(array));
        System.out.println();
    }

    public void runInsertionSort() {
        
        // SortingAlgorithms.InsertionSort
        System.out.println("    Insertion Sort: O(n^2)");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);
    }

    public void runBubbleSort() {
        // SortingAlgorithms.BubbleSort
        System.out.println("    Bubble Sort: O(n^2)");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
    }

    public void runSelectionSort() {
        // SortingAlgorithms.SelectionSort
        System.out.println("    Selection Sort: O(n^2)");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
    }

    public void runQuickSort() {
        // SortingAlgorithms.QuickSort
        System.out.println("    Quick Sort: Average Case O(nlog(n)), Worst Case O(n^2)");
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length-1);
        System.out.println("        " + Arrays.toString(array));
    }

    public void runMergeSort() {
        // SortingAlgorithms.MergeSort
        System.out.println("    Merge Sort: O(nlog(n))");
        MergeSort mergeSort = new MergeSort();
        System.out.println("        " + Arrays.toString(mergeSort.sort(array)));

    }

    

}
