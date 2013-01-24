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
        System.out.println("Tree:"); printTree(root);
        System.out.println("LeftHeight:"+leftTreeHeight(root));

    }

    static void printTree(TreeNode node)
    {
      if(node==null)
      {
          return;
      }
      System.out.print(node.data);
      printTree(node.leftNode);
      printTree(node.rightNode);

    }

    static int leftTreeHeight(TreeNode node)
    {
        if(node.leftNode==null){return 0;}
        return 1+leftTreeHeight(node.leftNode);
    }
}
