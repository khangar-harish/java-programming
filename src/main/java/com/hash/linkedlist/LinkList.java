package com.hash.linkedlist;

public class LinkList {

    private Node head;
    private Node tail;
    private int size;

    public LinkList() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void addLast(int val){

        if(tail == null){
            addFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void addAtIndex(int index, int val){

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
