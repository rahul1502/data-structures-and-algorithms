package DataStructures.LinkedLists;

public class LinkedListsRunner {

    public void run() {

        System.out.println("DataStructures.LinkedLists");

        // Singly Linked List
        SinglyNode a = new SinglyNode(1), b = new SinglyNode(2);
        SinglyNode c = new SinglyNode(3), d = new SinglyNode(4);
        a.next = b; b.next = c; c.next = d;

        // a -> b -> c -> d
        System.out.println("    Linked List: 1 -> 2 -> 3 -> 4");
        System.out.println("    countNodes(a): " + countNodes(a));
        SinglyNode x = new SinglyNode(6);
        System.out.print("    insertElement(a, 6, 2): ");
        insertElement(a, 6, 2);
        System.out.print("    deleteElement(a, 3): ");
        deleteElement(a, 3);

        // Doubly Linked List
        DoublyNode e = new DoublyNode(1), f = new DoublyNode(2);
        DoublyNode g = new DoublyNode(3), h = new DoublyNode(4);
        e.next = f; f.next = g; f.prev = e; g.next = h; g.prev = f; h.prev = g;

        // e <-> f <-> g <-> h

        // Circular Linked List
        d.next = a;

        System.out.println("--------------------------------------");
    }

    // Singly Linked List Operations

    int countNodes(SinglyNode head) {
        SinglyNode iter = head;
        int count = 1;
        while(iter.next != null) {
            count++;
            iter = iter.next;
        }
        return count;
    }

    void insertElement(SinglyNode head, int data, int position) {

        SinglyNode iter = head;
        for(int i=1;i<position;i++) {
            iter = iter.next;
        }
        SinglyNode element = new SinglyNode(data);

        SinglyNode temp = iter.next;
        iter.next = element;
        element.next = temp;

        printLinkedList(head);
    }

    void deleteElement(SinglyNode head, int position) {
        SinglyNode iter = head;
        for(int i=1;i<position;i++) {
            iter = iter.next;
        }
        SinglyNode temp = iter.next.next;
        iter.next.next = null;
        iter.next = temp;

        printLinkedList(head);
    }

    void printLinkedList(SinglyNode head) {

        SinglyNode iter = head;
        while(iter != null) {
            System.out.print(iter.data + " -> ");
            iter = iter.next;
        }
        System.out.println();
    }

}
