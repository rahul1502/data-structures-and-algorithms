package DataStructures.Stack;

import java.util.Arrays;

public class StackRunner {

    public void run() {

        System.out.println("DataStructures.Stack: ");

        // initialize stack
        Stack stack = new Stack(3);

        stack.push(4);
        stack.push(3);
        stack.push(-1);
        System.out.println("    push(4) push(3) push(-1): " + Arrays.toString(stack.stack));

        System.out.print("    push(8): ");
        stack.push(8);

        System.out.println("    pop(): " + stack.pop() + " | " + Arrays.toString(stack.stack));
        System.out.println("    peek(): " + stack.peek());

    }

}
