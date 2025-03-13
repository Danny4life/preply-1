package generics.classActivity7;

import java.util.ArrayList;

public class Stack<E>{
    private ArrayList<E> elements = new ArrayList<>();

    public void push(E item){
        elements.add(item);

    }


    public E pop(){
        if(elements.isEmpty()) return null;
        return elements.remove(elements.size() - 1);

    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Generics");
        stack.push("Python");


        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
