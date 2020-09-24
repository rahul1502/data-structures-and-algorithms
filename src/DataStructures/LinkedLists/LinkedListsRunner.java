package DataStructures.LinkedLists;

public class LinkedListsRunner {

    public void run() {

        System.out.println("DataStructures.LinkedLists");

        // Singly Linked List
        SinglyNode a = new SinglyNode(1);
        SinglyNode b = new SinglyNode(2);
        SinglyNode c = new SinglyNode(3);
        SinglyNode d = new SinglyNode(4);
        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d
        System.out.println("    countNodes(a) [a -> b -> c -> d]: " + countNodes(a));

        // Doubly Linked List
        DoublyNode e = new DoublyNode(1);
        DoublyNode f = new DoublyNode(2);
        DoublyNode g = new DoublyNode(3);
        DoublyNode h = new DoublyNode(4);
        e.next = f;
        f.next = g;
        f.prev = e;
        g.next = h;
        g.prev = f;
        h.prev = g;

        // e <-> f <-> g <-> h

        // Circular Linked List
        d.next = a;

        System.out.println("--------------------------------------");
    }

    int countNodes(SinglyNode head) {
        SinglyNode iter = head;
        int count = 1;
        while(iter.next != null) {
            count++;
            iter = iter.next;
        }
        return count;
    }
}
