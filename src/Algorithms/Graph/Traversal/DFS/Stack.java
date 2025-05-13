package Algorithms.Graph.Traversal.DFS;

import java.util.ArrayList;
import java.util.List;

import Algorithms.Graph.GraphNode;

public class Stack {

    public List<GraphNode> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(GraphNode node) {
        stack.add(node);
    }

    public GraphNode pop() {
        if (stack.size() == 0) {
            return null;
        }
        GraphNode poppedNode = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return poppedNode;
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public GraphNode peek() {
        if (stack.size() == 0) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }
}
