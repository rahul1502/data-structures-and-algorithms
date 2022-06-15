package Problems.LinkedListsDetectCycle;

public class LinkedListsDetectCycleRunner {

    public void run() {

        System.out.println("Problems.LinkedListsDetectCycleRunner: ");

        // Create a LinkedList
        Node a = new Node(1), b = new Node(2);
        Node c = new Node(3), d = new Node(4);
        Node e = new Node(5), f = new Node(6);
        Node g = new Node(7), h = new Node(8);
        Node i = new Node(9);

        // Create circular connections
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.next = f; f.next = g; g.next = h; h.next = i;

        // a -> b -> c -> d -> e -> f -> g -> h -> i
        System.out.println("    Linked List (Linear): 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9");
        System.out.println("    hasCycle(): " + hasCycle(a));

        // Make a looping connection
        i.next = d;

        // a -> b -> c -> d -> e -> f -> g -> h -> i -> d
        System.out.println("    Linked List (Circular): 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 4");
        System.out.println("    hasCycle(): " + hasCycle(a));
    }

    private boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (slow.next != null && fast.next != null && fast.next.next != null) {

            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
