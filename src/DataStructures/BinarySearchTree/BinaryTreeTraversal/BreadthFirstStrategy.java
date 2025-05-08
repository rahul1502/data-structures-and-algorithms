package DataStructures.BinarySearchTree.BinaryTreeTraversal;

import DataStructures.BinarySearchTree.BinaryNode;

import java.util.ArrayList;

public class BreadthFirstStrategy {

    public void BFSTraversal(BinaryNode root) {

        Queue queue = new Queue();
        queue.enqueue(root);

        while (!queue.isEmpty()) {

            BinaryNode element = queue.dequeue();
            System.out.print(element.data + " | ");

            if (element.left != null) {
                queue.enqueue(element.left);
            }
            if (element.right != null) {
                queue.enqueue(element.right);
            }
        }
    }
}
