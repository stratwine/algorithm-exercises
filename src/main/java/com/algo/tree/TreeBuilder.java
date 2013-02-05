package com.algo.tree;

public class TreeBuilder {

    public static TreeNode treeWithData()
    {
        TreeNode node1 = new TreeNode();
        TreeNode node2 = new TreeNode();
        TreeNode node3 = new TreeNode();
        TreeNode node4 = new TreeNode();
        TreeNode node5 = new TreeNode();
        TreeNode node6 = new TreeNode();
        TreeNode node7 = new TreeNode();
        TreeNode node8 = new TreeNode();
        TreeNode node9 = new TreeNode();

        node1.data=1; node2.data=2; node3.data=3; node4.data=4;
        node5.data=5;node6.data=6;node7.data=7;node8.data=8;node9.data=9;

        node1.leftNode=node2;
        node1.rightNode=node3;

        node2.leftNode=node4;
        node2.rightNode=node5;

        node4.leftNode=node6;
        node4.rightNode=node7;

        node3.leftNode=node8;
        node3.rightNode=node9;

        return node1;
    }
}
