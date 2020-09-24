package DataStructures.Arrays;

public class DynamicArray {

    int[] arr;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
    }

    public int[] insertElement(int element) {

        if(size < capacity) {
            arr[size] = element;
            size++;
        }
        else {
            int[] newArr = new int[capacity * 2];
            this.capacity = capacity * 2;

            for(int i=0; i<arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[size] = element;
            this.arr = newArr;
            size++;
        }

        return arr;
    }

    public int[] deleteElement(int index) {
        for(int i=index+1;i<size;i++) {
            this.arr[i-1] = arr[i];
        }
        this.arr[size-1] = 0;
        size--;

        return arr;
    }
}
