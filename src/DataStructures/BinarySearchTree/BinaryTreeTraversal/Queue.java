package DataStructures.BinarySearchTree.BinaryTreeTraversal;

import DataStructures.BinarySearchTree.BinaryNode;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    List<BinaryNode> queue;
    int rear;

    public Queue() {
        this.queue = new ArrayList<>();
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public BinaryNode peek() {
        return queue.get(0);
    }

    public void enqueue(BinaryNode element) {
        queue.add(element);
        rear++;
    }

    public BinaryNode dequeue() {

        if (!isEmpty()) {

            BinaryNode firstElement = peek();
            queue.remove(0);
            rear--;
            return firstElement;
        }
        else {
            System.out.println("Queue empty");
            return null;
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }

}
