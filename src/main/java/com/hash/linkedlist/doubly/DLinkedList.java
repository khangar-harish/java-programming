package com.hash.linkedlist.doubly;

import org.w3c.dom.Node;

public class DLinkedList {

    private Node head;
    private Node tail;
    private int size;
    public int getSize() {
        return size;
    }
    public DLinkedList() {
        this.size = 0;
    }
    public class Node {
        private int data;
        private Node next;
        private Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        if(head != null)
            head.prev = node;
        head = node;

        if(tail == null)
            tail = head;

        size++;
    }
    public void addLast(int data){
        Node node = new Node(data);
        node.prev = tail;
        if(tail != null)
            tail.next = node;
        tail = node;

        size++;
    }

    public void addAtIndex(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size){
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node temp = getNode(index);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size++;
    }

    public int deleteFirst(){
        if (head == null) {
            tail = null;
            return 0;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }

    public int deleteLast(){
        if (size <= 1) {
            deleteFirst();
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return data;
    }
    public int deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size -1){
            deleteLast();
        }
        Node temp = getNode(index);
        int data = temp.data;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return data;
    }
    public Node getNode(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void displayForward(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayBackward(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("END");
    }
}
