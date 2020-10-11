package Algorithms.GraphTraversal;

public class Queue {

    Vertex[] queue;
    int rear;

    // <-  <-
    public Queue(int capacity) {
        this.queue = new Vertex[capacity];
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public Vertex peek() {
        return queue[0];
    }

    public boolean contains(Vertex vertex) {

        for(int i=0; i<rear+1; i++) {
            if(queue[i] == vertex)
                return true;
        }
        return false;
    }

    public void enqueue(Vertex n) {
        if(!isFull()) {
            queue[rear + 1] = n;
            rear++;
        }
        else {
            System.out.println("Queue already full");
        }
    }

    public Vertex dequque() {
        if(!isEmpty()) {
            Vertex element = queue[0];
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
