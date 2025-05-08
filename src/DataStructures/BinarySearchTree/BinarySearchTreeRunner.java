package DataStructures.BinarySearchTree;

import DataStructures.BinarySearchTree.BinaryTreeTraversal.BreadthFirstStrategy;
import DataStructures.BinarySearchTree.BinaryTreeTraversal.DepthFirstStrategy;

public class BinarySearchTreeRunner {

    public void run() {

        System.out.println("DataStructures.BinarySearchTree: ");

        BinarySearchTree bst = new BinarySearchTree(new BinaryNode(15));

        System.out.println("Generating Binary Search Tree");

        bst.insertNode(bst.root, new BinaryNode(10)); bst.insertNode(bst.root, new BinaryNode(20));
        bst.insertNode(bst.root, new BinaryNode(8)); bst.insertNode(bst.root, new BinaryNode(12));
        bst.insertNode(bst.root, new BinaryNode(17));bst.insertNode(bst.root, new BinaryNode(25));
        bst.insertNode(bst.root, new BinaryNode(24));bst.insertNode(bst.root, new BinaryNode(13));
        bst.insertNode(bst.root, new BinaryNode(16));bst.insertNode(bst.root, new BinaryNode(18));
        bst.insertNode(bst.root, new BinaryNode(22));bst.insertNode(bst.root, new BinaryNode(23));

        System.out.println("    Root - " + bst.root.data);

        // find min element in BST
        System.out.println("    Maximum value: " + bst.getMaxValueNode(bst.root).data);

        // find max element in BST
        System.out.println("    Minimum value: " + bst.getMinValueNode(bst.root).data);

        // delete element from BST
        System.out.println("    Delete - " + 24);
//        bst.deleteNode(bst.root, 24);

        System.out.println("    Delete - " + 15);
//        bst.deleteNode(bst.root, 15);

        // search node
        BinaryNode node10 = bst.searchNode(bst.root, 10);
        System.out.println("    Search value 10: " + node10.data);

        // search node
        BinaryNode node15 = bst.searchNode(bst.root, 15);
        System.out.println("    Search value 10: " + node15);

        System.out.println();
        System.out.println("DFS Traversal - ");
        System.out.print("    preOrderTraversal - ");
        new DepthFirstStrategy().preOrderTraversal(bst.root);
        System.out.println();
        System.out.print("    inOrderTraversal - ");
        new DepthFirstStrategy().inOrderTraversal(bst.root);
        System.out.println();
        System.out.print("    postOrderTraversal - ");
        new DepthFirstStrategy().postOrderTraversal(bst.root);

        System.out.println();
        System.out.println();
        System.out.print("BFS Traversal - ");
        new BreadthFirstStrategy().BFSTraversal(bst.root);

        System.out.println();
        System.out.println();
        System.out.println("Lowest Common Encestor");
        System.out.println("    Node 16 and Node 25 - " + bst.getLowestCommonAncestor(bst.root, new BinaryNode(16), new BinaryNode(25)).data);
        System.out.println("    Node 12 and Node 10 - " + bst.getLowestCommonAncestor(bst.root, new BinaryNode(12), new BinaryNode(10)).data);
        System.out.println("    Node 17 and Node 25 - " + bst.getLowestCommonAncestor(bst.root, new BinaryNode(17), new BinaryNode(25)).data);

        System.out.println();
        System.out.println();
        System.out.print("Invert Binary Tree - ");
        bst.invertBinaryTree(bst.root);
        new BreadthFirstStrategy().BFSTraversal(bst.root);

        System.out.println();
        System.out.println();
        System.out.print("Binary Tree Height - " + bst.height(bst.root));

    }

}
