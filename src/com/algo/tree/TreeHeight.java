package com.algo.tree;


/**
 *                  1
 *              2       3
 *            4   5    8 9
 *           6 7
 */
public class TreeHeight {

    public static void main(String[] args)
    {
        TreeNode root=TreeBuilder.treeWithData();
        System.out.println("MinDepth:"+ minDepth(root,""));
        System.out.println("MaxDepth:"+ maxDepth(root,""));


    }


    static int minDepth(TreeNode node,String direction)
    {
        if(direction.equals("left")&&node.leftNode==null){
            return 0;

        }
        if(direction.equals("right")&&node.rightNode==null)
        {
            return 0;
        }
        int leftDepth = 1 + minDepth(node.leftNode,"left");
        int rightDepth = 1 + minDepth(node.rightNode,"right");

        return leftDepth<=rightDepth?leftDepth:rightDepth;
    }


    static int maxDepth(TreeNode node,String direction)
    {
        if(direction.equals("left")&&node.leftNode==null){
            return 0;

        }
        if(direction.equals("right")&&node.rightNode==null)
        {
            return 0;
        }
        int leftDepth = 1 + maxDepth(node.leftNode,"left");
        int rightDepth = 1 + maxDepth(node.rightNode,"right");

        return leftDepth>rightDepth?leftDepth:rightDepth;
    }
}
