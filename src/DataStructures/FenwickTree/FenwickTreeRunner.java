package DataStructures.FenwickTree;

import java.util.ArrayList;
import java.util.Arrays;

public class FenwickTreeRunner {

    public void run() {

        ArrayList<Integer> arrayList = new ArrayList<>(
                Arrays.asList(5, 7, 4, 6, 2, 8, 3, 0, 1, 4, 9, 3, 2, 0, 5, 8));

        FenwickTree fenwickTree = new FenwickTree(arrayList);

        System.out.println("Index      |   Array      |   FenwickTree");
        System.out.println("----------------------");

        for (int i = arrayList.size()-1; i >= 0; i--) {
            System.out.println((i+1) + "         |   " + arrayList.get(i) + "          |   " + fenwickTree.fenwickTree.get(i));
        }

        System.out.println("Range Query (4, 13): " + fenwickTree.rangeQuery(4, 13));
        System.out.println("Update element (8, 3)");
        fenwickTree.updateElement(8, 3);

        System.out.println("Index      |   Array      |   FenwickTree");
        System.out.println("----------------------");

        for (int i = arrayList.size()-1; i >= 0; i--) {
            System.out.println((i+1) + "         |   " + arrayList.get(i) + "          |   " + fenwickTree.fenwickTree.get(i));
        }

        System.out.println("Range Query (7, 10): " + fenwickTree.rangeQuery(7, 10));
    }

}
