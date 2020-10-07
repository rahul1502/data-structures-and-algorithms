package DataStructures.BinaryTree;

public class BinaryTreeRunner {

    public void run() {

        System.out.println("DataStructures.BinaryTree: ");

        // create nodes
        BinaryNode b1 = new BinaryNode(1), b2 = new BinaryNode(2), b3 = new BinaryNode(3),
                b8 = new BinaryNode(8), b9 = new BinaryNode(9), b11 = new BinaryNode(11),
                b12 = new BinaryNode(12), b15 = new BinaryNode(15), b17 = new BinaryNode(17),
                b21 = new BinaryNode(21), b25 = new BinaryNode(25), b27 = new BinaryNode(27),
                b31 = new BinaryNode(31), b36 = new BinaryNode(36), b47 = new BinaryNode(47);

        // create associations
        b1.left = b3; b1.right = b2; b3.left = b9; b3.right = b11; b2.left = b27; b2.right = b8;
        b9.left = b15; b11.left = b12; b11.right = b17; b8.left = b25; b17.left = b21; b17.right = b31;
        b25.right = b36; b21.right = b47;

        // findSum
        System.out.println("Sum of all nodes under b1 (including b1): " + findSum(b1));

        // maximum depth
        System.out.println("Maximum depth of the binary tree: " + maxDepth(b1));

    }

    // find the sum of all the nodes below (including) the root node
    int findSum(BinaryNode root) {
        if(root == null)
            return 0;

        return root.data + findSum(root.left) + findSum(root.right);
    }

    // find maximum depth of the binary tree
    int maxDepth(BinaryNode root) {

        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

}
