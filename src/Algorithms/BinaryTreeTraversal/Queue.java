package Algorithms.BinaryTreeTraversal;

public class Queue {

    BinaryNode[] queue;
    int rear;

    // <-  <-
    public Queue(int capacity) {
        this.queue = new BinaryNode[capacity];
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public BinaryNode peek() {
        return queue[0];
    }

    public void enqueue(BinaryNode n) {
        if(!isFull()) {
            queue[rear + 1] = n;
            rear++;
        }
        else {
            System.out.println("Queue already full");
        }
    }

    public BinaryNode dequque() {
        if(!isEmpty()) {
            BinaryNode element = queue[0];
            for(int i=1;i<=rear;i++) {
                queue[i-1] = queue[i];
            }
            queue[rear] = null;
            rear--;
            return element;
        }
        else {
            System.out.println("Queue already empty");
            return null;
        }
    }

}
