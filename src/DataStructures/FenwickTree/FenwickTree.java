package DataStructures.FenwickTree;

import java.util.ArrayList;
import java.util.List;

public class FenwickTree {

    public List<Integer> array;
    public List<Integer> fenwickTree;

    public FenwickTree(List<Integer> array) {
        this.array = array;
        constructFenwickTree(array);
    }

    private void constructFenwickTree(List<Integer> array) {
        fenwickTree = new ArrayList<>(array);
        int n = array.size();

        for (int i = 1 ; i <= n ; i++) {
            int j = i + LSB(i);

            if (j <= n) {
                fenwickTree.set(j-1, fenwickTree.get(j-1) + fenwickTree.get(i-1));
            }

        }
    }

    public int prefixSum(int i) {
        int sum = 0;
        while( i > 0 ) {
            sum += fenwickTree.get(i-1);
            i -= LSB(i);
        }
        System.out.println("prefixSum(" + i + ") - " + sum);
        return sum;
    }

    public int rangeQuery(int i, int j) {
        return prefixSum(j) - prefixSum(i-1);
    }

    public void updateElement(int i, int x) {
        int n = array.size();

        while(i <= n) {
            fenwickTree.set(i-1, fenwickTree.get(i-1) + x);
            i = i + LSB(i);
        }
    }

    private int LSB(int i) {
        return i & -i;
    }
}
