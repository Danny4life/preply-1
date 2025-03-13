package stack.classActivity1A;

import java.util.EmptyStackException;

public class StackLinkedListEx {

    private ListNode top; // this holds the top element

    private int length; // this store the lenght of the stack

    public class ListNode{
        private int data;

        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public StackLinkedListEx() {
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;

        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return top.data;
    }

    public static void main(String[] args) {
        StackLinkedListEx stack = new StackLinkedListEx();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        //System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());


    }
}
