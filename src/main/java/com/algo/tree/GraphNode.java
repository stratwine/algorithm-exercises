package com.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    GraphNode(String nodeName)
    {
     this.nodeName=nodeName;
    }

    public String nodeName;

    public List<GraphNode> nodes = new ArrayList<GraphNode>();

    @Override
    public boolean equals(Object obj)
    {
      return  ((GraphNode)(obj)).nodeName.equals(this.nodeName);
    }

    @Override
    public String toString()
    {
        return this.nodeName;
    }

    @Override
    public int hashCode()
    {
       return this.nodeName.hashCode();

    }
}
