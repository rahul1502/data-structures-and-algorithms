package Algorithms.GraphTraversal;

import java.util.ArrayList;

public class BreadthFirstTraversal {

    Queue queue;

    public BreadthFirstTraversal(int maxNodes) {
        this.queue = new Queue(maxNodes);
    }

    public Vertex[] depthFirstTraversal(Vertex startNode) {

        ArrayList<Vertex> traversalList = new ArrayList<>();

        queue.enqueue(startNode);

        Vertex visited;
        while (!queue.isEmpty()) {

            visited = queue.dequque();
            traversalList.add(visited);

            for(Vertex connection: visited.getConnections()) {
                if(!traversalList.contains(connection) && !queue.contains(connection)) {
                    queue.enqueue(connection);
                }
            }

            printStatus(traversalList);
        }

        return traversalList.toArray(new Vertex[0]);
    }

    private void printStatus(ArrayList<Vertex> traversalList) {
        System.out.print("        Traversed: ");
        for(Vertex i: traversalList) {
            System.out.print(i.getName() + " ");
        }
        System.out.print(" Queue: ");
        for(int i=0 ; i< queue.rear + 1; i++) {
            System.out.print(queue.queue[i].getName() + " ");
        }
        System.out.println();
    }
}
