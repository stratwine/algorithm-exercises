package com.algo.tree;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstGraphTraversal {

    public static void main(String[] args) {

        GraphNode graphNode = GraphBuilder.build();
        traverse(graphNode);

    }

    private static void traverse(GraphNode graphNode) {

        Set visited = new LinkedHashSet<GraphNode>();
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.offer(graphNode);

        while (!queue.isEmpty()) {
            GraphNode node = queue.poll();
            visited.add(node);

            for (GraphNode associatedNode : node.nodes) {
                if (!visited.contains(associatedNode)) {
                    queue.offer(associatedNode);
                }
            }
        }

        System.out.println("Visited: " + visited);
    }


}