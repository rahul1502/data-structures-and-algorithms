package DataStructures.Stack;

public class Stack {

    int[] stack;
    int top;

    public Stack(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int peek() {
        return stack[top];
    }

    public boolean push(int n) {
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

    public int pop() {
        if(! isEmpty()) {
            int element = stack[top];
            stack[top] = 0;
            top--;
            return element;
        }
        else {
            System.out.println("Stack already empty");
            return -1;
        }
    }
}
