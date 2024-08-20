package com.hash.stack;

import com.hash.linkedlist.LinkList;
import com.hash.linkedlist.doubly.DLinkedList;

public class LStack {

    int size;
    Node top;

    public LStack(){
        size = 0;
        top = null;
    }

    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
        Node node = new Node(data);
        if(node == null) {
            return;
        }
        node.next = top;
        top = node;
        size++;
    }

    public int pop(){
        if(top == null){
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek(){
        if(top != null)
            return top.data;
        else
            return -1;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void display(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
