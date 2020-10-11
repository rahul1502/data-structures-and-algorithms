package Algorithms.ShortestPathAlgorithms;

import java.util.*;

public class DijkstraShortestPathAlgorithm {

    public HashMap<Vertex, Integer> findShortestPath(WeightedGraph graph, Vertex startNode) {

        HashMap<Vertex, Integer> priorityQueue = new HashMap<Vertex, Integer>() {{
            put(startNode, 0);
        }};

        List<Vertex> visitedNodes = new ArrayList<>();

        // set all distances to INFINITE
        HashMap<Vertex, Integer> dist = new HashMap<>();
        for(Vertex i: graph.getVertexList()) {
            if(i == startNode)
                dist.put(i, 0);
            else
                dist.put(i, Integer.MAX_VALUE);
        }

        while (!priorityQueue.isEmpty()) {

            Vertex currentNode = Collections.min(priorityQueue.entrySet(), Map.Entry.comparingByValue()).getKey();

            for(Map.Entry<Vertex, Integer> i: currentNode.getConnections().entrySet()) {
                if(!visitedNodes.contains(i.getKey())) {

                    // find distance from startNode to currentNode + currentNode to i
                    int pathDistance = dist.get(currentNode) + i.getValue();

                    // compare the weight with dist and update
                    if(pathDistance < dist.get(i.getKey())) {
                        priorityQueue.put(i.getKey(), pathDistance);
                        dist.put(i.getKey(), pathDistance);
                    }
                }
            }
            // node visited
            visitedNodes.add(currentNode);
            // remove it from the priority queue
            priorityQueue.remove(currentNode);
        }

        return dist;
    }


}
