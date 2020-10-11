package Algorithms.GraphTraversal;

public class Stack {

    Vertex[] stack;
    int top;

    public Stack(int capacity) {
        this.stack = new Vertex[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public Vertex peek() {
        return stack[top];
    }

    public boolean contains(Vertex vertex) {

        for(int i=0; i<top+1; i++) {
            if(stack[i] == vertex)
                return true;
        }
        return false;
    }

    public boolean push(Vertex n) {
        if(! isFull()) {
            stack[top + 1] = n;
            top++;
            return true;
        }
        else {
            System.out.println("Stack already full");
            return false;
        }
    }

    public Vertex pop() {
        if(! isEmpty()) {
            Vertex element = stack[top];
            stack[top] = null;
            top--;
            return element;
        }
        else {
            System.out.println("Stack already empty");
            return null;
        }
    }

}
