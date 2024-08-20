package com.hash.stack;

public class ArrayStack {

    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println(st.isEmpty());
        st.push(10);
        st.pop();
        st.pop();
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.getSize());
        System.out.println(st.peek());
        System.out.println("Popped element "+st.pop());
        System.out.println("Popped element "+st.pop());
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st.peek());
        st.push(80);
        System.out.println(st.getSize());
        System.out.println(st.isEmpty());
        //st.push(50);
        //st.push(60);

        st.display();
    }
}
