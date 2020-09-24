package DataStructures.Trees;

public class TreesRunner {

    public void run() {

        // create binary tree
        BinaryNode a = new BinaryNode(2);
        BinaryNode b = new BinaryNode(3);
        BinaryNode c = new BinaryNode(4);
        BinaryNode d = new BinaryNode(5);
        BinaryNode e = new BinaryNode(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(findSum(a));
    }

    // find the sum of all the nodes below (including) the root node
    int findSum(BinaryNode root) {
        if(root == null)
            return 0;

        return root.data + findSum(root.left) + findSum(root.right);
    }
}
