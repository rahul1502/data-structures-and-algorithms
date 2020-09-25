package DataStructures.Queue;

public class Queue {

    int[] queue;
    int rear;

    // <-  <-
    public Queue(int capacity) {
        this.queue = new int[capacity];
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public int peek() {
        return queue[0];
    }

    public void enqueue(int n) {
        if(!isFull()) {
            queue[rear + 1] = n;
            rear++;
        }
        else {
            System.out.println("Queue already full");
        }
    }

    public int dequque() {
        if(!isEmpty()) {
            int element = queue[0];
            for(int i=1;i<=rear;i++) {
                queue[i-1] = queue[i];
            }
            queue[rear] = 0;
            rear--;
            return element;
        }
        else {
            System.out.println("Queue already empty");
            return -1;
        }
    }
}
