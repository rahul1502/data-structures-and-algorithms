package Algorithms.GraphTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DepthFirstTraversal {

    Stack stack;

    public DepthFirstTraversal(int maxNodes) {
        this.stack = new Stack(maxNodes);
    }

    public Vertex[] depthFirstTraversal(Vertex startNode) {

        ArrayList<Vertex> traversalList = new ArrayList<>();

        stack.push(startNode);

        Vertex visited;
        while (!stack.isEmpty()) {

            visited = stack.peek();
            if(!traversalList.contains(visited))
                traversalList.add(visited);

            List<Vertex> unVisitedConnections =
                    visited.getConnections().stream()
                            .filter(connection -> !traversalList.contains(connection))
                            .collect(Collectors.toList());

            if(unVisitedConnections.size() > 0)
                stack.push(unVisitedConnections.get(0));
            else
                stack.pop();

            printStatus(traversalList);
        }
        return traversalList.toArray(new Vertex[0]);
    }

    private void printStatus(ArrayList<Vertex> traversalList) {
        System.out.print("        Traversed: ");
        for(Vertex i: traversalList) {
            System.out.print(i.getName() + " ");
        }
        System.out.print(" Stack: ");
        for(int i=0 ; i< stack.top + 1; i++) {
            System.out.print(stack.stack[i].getName() + " ");
        }
        System.out.println();
    }
}
