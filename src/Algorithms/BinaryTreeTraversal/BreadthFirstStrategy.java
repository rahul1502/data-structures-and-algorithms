package Algorithms.BinaryTreeTraversal;

import java.util.ArrayList;

public class BreadthFirstStrategy {

    Queue queue;

    public BreadthFirstStrategy(int maxNodes) {
        this.queue = new Queue(maxNodes);
    }

    public String[] levelOrderTraversal(BinaryNode root) {

        ArrayList<String> traversalList = new ArrayList<>();

        queue.enqueue(root);

        BinaryNode visited;
        while (!queue.isEmpty()) {

            visited = queue.dequque();
            traversalList.add(visited.data);

            if(visited.left != null) {
                queue.enqueue(visited.left);
            }

            if(visited.right != null) {
                queue.enqueue(visited.right);
            }
        }

        return traversalList.toArray(new String[0]);
    }
}
