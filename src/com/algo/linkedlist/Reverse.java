package com.algo.linkedlist;

public class Reverse {

    public static void main (String[] args)
    {
        LinkedListNode node1 = new LinkedListNode();
        LinkedListNode node2 = new LinkedListNode();
        LinkedListNode node3 = new LinkedListNode();
        LinkedListNode node4 = new LinkedListNode();
        LinkedListNode node5 = new LinkedListNode();
        LinkedListNode node6 = null;

        node1.data=1;
        node2.data=2;
        node3.data=3;
        node4.data=4;
        node5.data=5;

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        rev(node1);

        Traversal.printNodes(node5);
    }

    /* 1--->2-->3--->4--->null
    */
    private static LinkedListNode rev(LinkedListNode node) {

        if(node==null)
        {
            return null;

        }

        if(node.next==null)
        {
            return node;
        }

        /* 1--->2-->3--->4--->null

        1(rev 234)           returns 4-->3-->2-->1
            2(rev 34)        returns 4-->3-->2
                3(rev 4)     returns 4-->3
                   4         returns 4
        */


        LinkedListNode secondElement = node.next;

        node.next=null;

        LinkedListNode reversed=rev(secondElement);
        secondElement.next=node;


       return  reversed;

    }
}
