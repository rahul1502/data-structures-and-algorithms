package Algorithms.SortingAlgorithms;

public class QuickSort {

    public void sort(int[] array, int start, int end) {

        if(start >= end) {
            return;
        }

        int pivotIndex = partition(array, start, end);

        sort(array, start, pivotIndex - 1);
        sort(array, pivotIndex + 1, end);
    }

    private int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int pIndex = start;
        int temp;

        for(int i=start; i<end; i++) {
            if(array[i] <= pivot) {
                temp = array[i];
                array[i] = array[pIndex];
                array[pIndex] = temp;

                pIndex++;
            }
        }

        temp = array[pIndex];
        array[pIndex] = array[end];
        array[end] = temp;

        return pIndex;
    }
}
