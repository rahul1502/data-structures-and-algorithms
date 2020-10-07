package Problems.ExpressionParsing;

public class Stack {

    String[] stack;
    int top;

    public Stack(int capacity) {
        this.stack = new String[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public String peek() {
        return stack[top];
    }

    public boolean push(String n) {
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

    public String pop() {
        if(! isEmpty()) {
            String element = stack[top];
            stack[top] = "";
            top--;
            return element;
        }
        else {
            System.out.println("Stack already empty");
            return null;
        }
    }

}
