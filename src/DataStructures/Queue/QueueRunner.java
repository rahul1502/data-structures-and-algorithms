package DataStructures.Queue;

import java.util.Arrays;

public class QueueRunner {

    public void run() {

        System.out.println("DataStructures.Queue: ");

        // initialize Queue
        Queue queue = new Queue(3);

        queue.enqueue(3);
        queue.enqueue(8);
        queue.enqueue(-2);
        System.out.println("    enqueue(3) enqueue(8) enqueue(-2): " + Arrays.toString(queue.queue));

        System.out.print("    enqueue(4): ");
        queue.enqueue(4);

        System.out.println("    dequque(): " + queue.dequque() + " | " + Arrays.toString(queue.queue));
        System.out.println("    peek(): " + queue.peek());

    }
}
