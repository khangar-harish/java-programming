package com.hash.linkedlist.doubly;

public class DLLMain {

    public static void main(String[] args) {
        DLinkedList dl = new DLinkedList();
        dl.addFirst(10);
        dl.addFirst(20);
        dl.addLast(30);
        dl.addAtIndex(2, 100);
        dl.addAtIndex(2, 1200);
        dl.displayForward();
        dl.deleteFirst();
        dl.displayForward();
        //System.out.println(dl.deleteLast());
        //dl.deleteLast();
        dl.deleteAtIndex(2);
        dl.displayForward();
        //dl.displayBackward();
        System.out.println(dl.getSize());
    }
}
