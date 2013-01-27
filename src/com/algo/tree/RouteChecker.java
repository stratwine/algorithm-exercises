package com.algo.tree;

import java.util.LinkedHashSet;
import java.util.Set;

public class RouteChecker {

    public static void main(String[] args)
    {
        GraphNode start=GraphBuilder.build();
        GraphNode destination=new GraphNode("F");

        Set mSet = new LinkedHashSet<GraphNode>();
        Set<GraphNode> nodesVisited=visitNodes(start,mSet);
        System.out.println("Visited Nodes:" +mSet);
        System.out.println(nodesVisited.contains(destination));

    }

    private static Set<GraphNode> visitNodes(GraphNode start,Set<GraphNode> graphNodes) {

        for(GraphNode connection : start.nodes)
        {
            if(graphNodes.contains(connection))
            {
                continue;
            }
            else{
                graphNodes.add(connection);
                visitNodes(connection, graphNodes);
            }
        }
        return graphNodes;
    }
}