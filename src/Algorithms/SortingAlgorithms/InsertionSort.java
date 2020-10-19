package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] array) {

        int hole;
        int holeElement;
        int n = array.length;

        for(int i=1; i<n; i++) {

            hole = i;
            holeElement = array[i];

            for (int j=hole-1; j>=0; j--) {
                if(array[j] > holeElement) {
                    array[j+1] = array[j];

                    if(j==0) {
                        array[j] = holeElement;
                    }
                }
                else {
                    array[j+1] = holeElement;
                    break;
                }

            }

            System.out.println("        Hole: " + holeElement + " Array: " + Arrays.toString(array));

        }

        return array;
    }

}
