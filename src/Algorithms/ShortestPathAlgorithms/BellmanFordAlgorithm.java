package Algorithms.ShortestPathAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class BellmanFordAlgorithm {

    public HashMap<Vertex, Integer> findShortestPath(WeightedGraph graph, Vertex startNode) {

        // set all distances to INFINITE
        HashMap<Vertex, Integer> dist = new HashMap<>();
        for(Vertex i: graph.getVertexList()) {
            if(i == startNode)
                dist.put(i, 0);
            else
                dist.put(i, Integer.MAX_VALUE);
        }

        for(int i=0; i<dist.size(); i++) {
            for(Vertex j: graph.getVertexList()) {
                for(Map.Entry<Vertex, Integer> k: j.getConnections().entrySet()) {

                    // perform Relaxation
                    if(dist.get(j) + k.getValue() < dist.get(k.getKey())) {
                        dist.put(k.getKey(), dist.get(j) + k.getValue());
                    }
                }
            }
        }

        return dist;
    }

}
