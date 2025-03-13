package stack.classActivity2A;

import java.util.Scanner;

public class StackArray {

    // This represents the index of the topmost element in the stack
    // Initially it will be et to an invalid index, which indicate an empty stack.
    private int top;

    // This set the default maximum size of the stack to 10.
    // This value can be overridden be a parameterized constructor
    private int maxSize = 10;

    // This create an array of integers to store the stack elements
    // the size of the array is determined by the max size.
    private int[] arr = new int[maxSize];

    public StackArray(int top, int maxSize) {
        this.top = top;
        this.maxSize = maxSize;
    }

    public StackArray() {
        this.top = top - 1;
    }


    // Method purpose : Checks if the stack is empty
    // How it works:
    // return ture if the top is less than 0(which indicate that no element is in the stack).
    // else return false.
    public boolean isEmpty(){
        return top < 0;
    }


    // Method purpose: Add an element to the top of the stack
    // How it works:
    // First check for stack overflow:
    // if top == maxSize, the stack is full, and no new element can be added.
    // To Push Element into the Stack:
    // Prompt the user to enter a value - using scanner class
    // Increments the top to point to the next available position in the stack.
    // Then assigned the value to the array at the new top index.
    // prints a success message and return the value.

    public boolean push(Scanner sc){
        if(top == maxSize){
            System.out.println("Stack Overflow!!!");
            return false;
        }else {
            System.out.println("Enter your value");

            int val = sc.nextInt();
            top++;
            arr[top] = val;

            System.out.println("Item has been pushed into the stack");

            return true;
        }
    }


    // Purpose : Removes item from the top of the stack
    // How it works:
    // first check for Stack underflow:
    // if top == -1, it means the stack is empty, an no elements can be added.
    // Pop Elements:
    // Decrement the top to remove the topmost element.
    // print out a success message and returns true
    public boolean pop(){
        if(top == -1){
            System.out.println("Stack Underflow!!!");
            return false;
        }else {
            top--;
            System.out.println("Item has been popped off the stack");
            return true;
        }
    }


    // Purpose: Display all elements in the stack from top to bottom
    // How it works:
    // Iterates through the array starting from the top to bottom.
    // print each element in the stack.
    public void display(){
        System.out.println("Printing stack elements....");
        for(int i = top; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
