package DataStructures.BinarySearchTree.BinaryTreeTraversal;

import DataStructures.BinarySearchTree.BinaryNode;

public class DepthFirstStrategy {

    public void preOrderTraversal(BinaryNode root) {

        if(root == null) {
            return;
        }

        System.out.print(root.data + ", ");

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(BinaryNode root) {

        if(root == null) {
            return;
        }

        inOrderTraversal(root.left);

        System.out.print(root.data + ", ");

        inOrderTraversal(root.right);

    }

    public void postOrderTraversal(BinaryNode root) {

        if(root == null) {
            return;
        }

        postOrderTraversal(root.left);

        postOrderTraversal(root.right);

        System.out.print(root.data + ", ");

    }

}
