package com.company.PartTwo.JavaCollections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackLearn {
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push("+ a + ")");
        System.out.println("Stack: " + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("Stack: " + st);
    }

    public static void main(String [] args){
        Stack<Integer> st = new Stack<>();
        System.out.println("Stack: " + st);

        try {
            showpush(st, 42);
            showpush(st, 66);
            showpush(st, 99);
            showpop(st);
            showpop(st);
            showpop(st);

            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty.");
        }

    }
}
