package Algorithms.Graph.TopologicalSort.DFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import Algorithms.Graph.Graph;
import Algorithms.Graph.GraphNode;

public class TopologicalSort {
    
    private Set<GraphNode> visited = new HashSet<>();
    private Stack<GraphNode> stack = new Stack<>();

    public void sort(Graph graph) {

        System.out.println("        Topological Sort: ");

        for (GraphNode node: graph.nodeList) {
            if (!visited.contains(node)) {
                dfs(node);
            }
        }

        System.out.print("        [ ");
        while (!stack.empty()) {
            System.out.print(stack.pop().name + " ");
        }
        System.out.print("]");
    }

    public void dfs(GraphNode node) {

        visited.add(node);
        for (GraphNode neighbour: node.connections) {
            if (!visited.contains(neighbour)) {
                dfs(neighbour);
            }
        }
        stack.push(node);
    }

}
