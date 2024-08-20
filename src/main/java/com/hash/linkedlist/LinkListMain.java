package com.hash.linkedlist;

public class LinkListMain {

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(50);
        list.addAtIndex(3,100);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtIndex(2);
        list.display();
        System.out.println(list.size()+ "    " +list.getSize());
    }

}
