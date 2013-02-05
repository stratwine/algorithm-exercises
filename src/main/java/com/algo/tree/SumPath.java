package com.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class SumPath {

    public static void main(String[] args) {

        TreeNode rootNode = TreeBuilder.treeWithData();
        int expectedSum=7;
        List<TreeNode> path = new ArrayList<TreeNode>();
        findSum(rootNode,expectedSum,path);
    }

    private static void findSum(TreeNode node, int expectedSum, List<TreeNode> path) {

        //exit conditions

        if(node==null)
        {
            return;
        }

        path.add(node);

        //if expected sum is arrived, print the path

         int temp=expectedSum;
         for(int i=path.size()-1;i>=0;i--)
         {
            int data= path.get(i).data;
            temp=temp-data;
            if(temp==0)
            {
                printPath(path,i);
            }
         }

        // anyway proceed to the next node

        findSum(node.leftNode,expectedSum,new ArrayList<TreeNode>(path));
        findSum(node.rightNode,expectedSum,new ArrayList<TreeNode>(path));

    }

    private static void printPath(List<TreeNode> path, int i) {
        for(int j=i;j<path.size();j++)
        {
            System.out.print(path.get(j).data);
        }
        System.out.println("");
    }
}
