package stack.classActivity0A;

import java.util.Stack;

public class DefaultStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");

        stack.pop();


        System.out.println(stack);
    }
}
