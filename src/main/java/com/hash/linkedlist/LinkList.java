package com.hash.linkedlist;

public class LinkList {

    private Node head;
    private Node tail;
    private int size;
    public int getSize() {
        return size;
    }

    public LinkList() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
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
        if(index == 0){
            addFirst(val);
            return;
        }

        if(index == size){
            addLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++){
             temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null)
            tail = null;

        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = secondLast.next.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index){
        if(index == 0)
            deleteFirst();

        if(index == size - 1)
            deleteLast();

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node get(int index){

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int size(){
        int count = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
