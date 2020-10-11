package Algorithms.BinaryTreeTraversal;

import java.util.Arrays;

public class BinaryTreeTraversalRunner {

    public void run() {

        System.out.println("Algorithms.BinaryTreeTraversal: ");

        // create binary tree
        BinaryNode a = new BinaryNode("A"), b = new BinaryNode("B"), c = new BinaryNode("C"),
                d = new BinaryNode("D"), e = new BinaryNode("E"), f = new BinaryNode("F"),
                g = new BinaryNode("G"), h = new BinaryNode("H"), i = new BinaryNode("I"),
                j = new BinaryNode("J"), k = new BinaryNode("K"), l = new BinaryNode("L");

        f.left = d; f.right = k;
        d.left = b; d.right = e; b.left = a; b.right = c;
        k.left = h; k.right = l; h.left = g; h.right = j; j.left = i;

        System.out.println("    Binary Tree created...");

        System.out.println("    Breadth First Strategy: ");

        BreadthFirstStrategy breadthFirstStrategy = new BreadthFirstStrategy(15);
        System.out.println("        Level Order traversal " + Arrays.toString(breadthFirstStrategy.levelOrderTraversal(f)));

        System.out.println("    Depth First Strategy: ");

        DepthFirstStrategy depthFirstStrategy = new DepthFirstStrategy();
        System.out.print("        Pre-order traversal: [");
        depthFirstStrategy.preorderTraversal(f);
        System.out.println("]");

        System.out.print("        In-order traversal: [");
        depthFirstStrategy.inorderTraversal(f);
        System.out.println("]");

        System.out.print("        Post-order traversal: [");
        depthFirstStrategy.postOrderTraversal(f);
        System.out.println("]");


    }
}
