package com.algo.linkedlist;

public class Traversal {

    public static void main(String[] args)
    {
       LinkedListNode headNode = new LinkedListNode();
       headNode.data=55;
       createNodes(headNode,0);
        printNodes(headNode);



    }

    public static void printNodes(LinkedListNode node)
    {
       while(node.next!=null)
       {
           System.out.print(node.data);
           node=node.next;
       }
        System.out.print(node.data);
    }
    public static void createNodes(LinkedListNode node,int data)
    {
       if(data==10)
       {
         node.next=null;
           return;
       }
       else{
           LinkedListNode nextNode = new LinkedListNode();
           nextNode.data=data;
           node.next=nextNode;
           createNodes(nextNode,++data);
       }



    }
}
