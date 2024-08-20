package com.hash.stack;

import java.util.Arrays;

public class Stack {

    int[] arr;
    int size;
    int top;

    public Stack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public void push(int data){
        if(top == size-1){
            System.out.println("Stack is overflow");
            return;
        }

        top++;
        arr[top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }

        top--;
        return arr[top+1];
    }

    public int peek(){
        if(top == -1){
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int getSize(){
        return top+1;
    }

    public void display(){
        System.out.println(Arrays.toString(arr));
    }
}
