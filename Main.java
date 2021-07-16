package com.Stack;

public class Main {

    public static void main(String[] args) {
        SpecialStack specialStack=new SpecialStack(new int[]{18,19,29,15,16});
        System.out.println(specialStack.isFull());
        specialStack.pop();specialStack.push(1);
        System.out.println(specialStack.getMin());
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        System.out.println(specialStack.isEmpty());


    }
}
