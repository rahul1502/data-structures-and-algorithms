package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] array) {

        int n = array.length;

        for(int i=1; i<n; i++) {

            int j = i;
            while (j > 0 && array[j-1] > array[j]) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;

                System.out.println("          Swap " + array[j-1] + " <-> " + array[j]);

                j = j-1;
            }
            
            System.out.println("        Array: " + Arrays.toString(array));

        }

        return array;
    }

}
