package com.algo.tree;

public class GraphBuilder {

    public static GraphNode build()
    {
        GraphNode one = new GraphNode("A");
        GraphNode two = new GraphNode("B");
        GraphNode three = new GraphNode("C");
        GraphNode four = new GraphNode("D");
        GraphNode five = new GraphNode("E");
        GraphNode six = new GraphNode("F");

        one.nodes.add(two);
        two.nodes.add(one);
        two.nodes.add(three);
        three.nodes.add(four);
        three.nodes.add(five);
        five.nodes.add(six);

        return one;
    }
}
