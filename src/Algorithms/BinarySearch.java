package Algorithms;

import java.util.Arrays;

public class BinarySearch {

    public int doBinarySearch(int[] arr, int n) {

        int left = 0, right = arr.length-1;
        int mid = arr.length / 2;

        System.out.println(Arrays.toString(arr) + " mid: " + arr[mid] +
                " left: " + arr[left] + " right: " + arr[right]);

        if(n < arr[mid]) {
            right = mid;
            return doBinarySearch(Arrays.copyOfRange(arr, left, right), n);
        }
        else if (n > arr[mid]) {
            left = mid;
            return doBinarySearch(Arrays.copyOfRange(arr, left, right), n);
        }
        else {
            System.out.println("Found " + n + " at: " + mid);
            return n;
        }
    }


}
