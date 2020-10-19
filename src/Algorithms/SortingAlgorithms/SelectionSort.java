package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] array) {

        int min = 0;
        int[] sortedArray = new int[array.length];

        for(int i=0; i<array.length; i++) {

            // find the index of the minimum element of the array
            for(int j=0; j<array.length; j++) {
                if(array[j]<=array[min]){
                    min = j;
                }
            }

            // add the minimum element of the array to the sorted array
            // replace the minimum element of array with max value so that we dont select that next time
            sortedArray[i] = array[min];
            array[min] = Integer.MAX_VALUE;
            System.out.println("        Sorted Array: " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

}
