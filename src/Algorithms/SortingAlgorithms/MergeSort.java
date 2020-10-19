package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] array) {

        int n = array.length;

        if(n < 2) {
            return array;
        }

        int mid = n / 2;

        int[] leftArr = Arrays.copyOfRange(array, 0, mid);
        int[] rightArr = Arrays.copyOfRange(array, mid, n);

        leftArr = sort(leftArr);
        rightArr = sort(rightArr);
        return merge(leftArr, rightArr);
    }

    private int[] merge(int[] leftArr, int[] rightArr) {

        int nl = leftArr.length, nr = rightArr.length;
        int i = 0, j = 0, k = 0;

        int[] array = new int[nl + nr];

        while (i < nl && j < nr) {
            if(leftArr[i] <= rightArr[j]){
                array[k] = leftArr[i];
                i++;
            }
            else {
                array[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < nl) {
            array[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < nr) {
            array[k] = rightArr[j];
            j++;
            k++;
        }

        return array;
    }
}
