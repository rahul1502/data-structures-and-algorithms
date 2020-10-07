package DataStructures.Arrays;

import java.util.Arrays;

public class ArraysRunner {

    public void run() {
        // DataStructures.StaticArrays
        int[] arr1 = new int[] {4, 3, 5, -3, -5, 6, 7, 9, 12};
        StaticArray staticArray = new StaticArray(arr1);
        System.out.println("DataStructures.StaticArray: ");
        System.out.println("    Array: " + Arrays.toString(arr1));
        System.out.println("    getElement(2): " + staticArray.getElement(2));
        System.out.println("    searchElement(-5): " + staticArray.searchElement(-5));

        System.out.println("--------------------------------------");

        // DataStructures.StaticArrays
        DynamicArray dynamicArray = new DynamicArray(1);
        System.out.println("DataStructures.DynamicArray: ");
        System.out.println("    insertElement(1): " + Arrays.toString(dynamicArray.insertElement(1)));
        System.out.println("    insertElement(2): " + Arrays.toString(dynamicArray.insertElement(2)));
        System.out.println("    insertElement(3): " + Arrays.toString(dynamicArray.insertElement(3)));
        System.out.println("    insertElement(4): " + Arrays.toString(dynamicArray.insertElement(4)));
        System.out.println("    deleteElement(2): " + Arrays.toString(dynamicArray.deleteElement(2)));
        System.out.println("    insertElement(5): " + Arrays.toString(dynamicArray.insertElement(5)));
        System.out.println("    insertElement(6): " + Arrays.toString(dynamicArray.insertElement(6)));

    }
}
