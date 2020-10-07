package Algorithms.BinaryTreeTraversal;

import java.util.ArrayList;

public class DepthFirstStrategy {

    public void preorderTraversal(BinaryNode root) {

        if(root == null) {
            return;
        }

        System.out.print(root.data + ", ");

        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void inorderTraversal(BinaryNode root) {

        if(root == null) {
            return;
        }

        inorderTraversal(root.left);

        System.out.print(root.data + ", ");

        inorderTraversal(root.right);

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
