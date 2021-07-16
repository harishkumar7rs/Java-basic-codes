package com.Stack;

import java.util.Arrays;

public class SpecialStack {
    static int[] stack={};
    static int top=stack.length-1;
    static int size= stack.length;

    SpecialStack(int[] stak){
        stack=stak;
        top=stack.length-1;
        size= stack.length;
    }


    public void push(int n){
        if (top<size){
            top++;
            stack[top]=n;
            System.out.println(Arrays.toString(stack));

        }
        else System.out.println("Stack is OverFlow");
    }
    public void pop(){
        int x=0;
        if(top>-1){
            stack[top]=x;
            top--;
        }else {System.out.println("Stack is underflow");}

    }
    public boolean isEmpty(){
        return top==-1?true:false;
    }
    public boolean isFull(){
        return top==size-1?true:false;
    }
    public int getMin(){
        int t=0;
        int min=stack[0];
        while(t+1<size){
            if (min>stack[t+1]){
                min=stack[t+1];
            }
            t++;
        }return min;
    }
}
