package Algorithms.Graph.Traversal.DFS;

import java.util.ArrayList;
import java.util.List;

import Algorithms.Graph.GraphNode;

public class DFSTraversal {

    private Stack stack;

    public DFSTraversal() {
        stack = new Stack();
    }

    public List<GraphNode> depthFirstSearchTraversal(GraphNode startNode) {

        List<GraphNode> visitedNodes = new ArrayList<>();

        stack.push(startNode);

        GraphNode currentNode = stack.peek();
        visitedNodes.add(currentNode);
        boolean newNode = false;
        while (!stack.isEmpty()) {
            newNode = false;
            for (GraphNode i: currentNode.connections) {
                if (!visitedNodes.contains(i)) {
                    stack.push(i);
                    currentNode = i;
                    visitedNodes.add(currentNode);
                    newNode = true;
                    break;
                }
            }
            if (!newNode) {
                currentNode = stack.pop();
            }
            printStatus(visitedNodes); 
        }

        return visitedNodes;
    }

    private void printStatus(List<GraphNode> visitedNodes) {
        System.out.print("        Traversed: ");
        for(GraphNode i: visitedNodes) {
            System.out.print(i.name + " ");
        }
        System.out.print(" Stack: ");
        for(GraphNode i: stack.stack) {
            System.out.print(i.name + " ");
        }
        System.out.println();
    }

    
}
