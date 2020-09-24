package DataStructures.Arrays;

public class StaticArray {

    int[] arr;

    public StaticArray(int[] arr) {
        this.arr = arr;
    }

    public int getElement(int n) {
        return arr[n];
    }

    public int searchElement(int n) {
        int element = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == n) {
                return i;
            }
        }
        return element;
    }
}
