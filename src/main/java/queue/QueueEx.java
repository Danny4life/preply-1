package queue;

import java.util.NoSuchElementException;

public class QueueEx {

    private ListNode front;

    private ListNode rear;

    private int length;

    public QueueEx() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return  length == 0;
    }

    // 1A enqueue operation for inserting element into the queue

    // front = 1, 2

    public void enqueue(int data){
        ListNode temp = new ListNode(data);

        if(isEmpty()){
            front = temp;
        }else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public void print(){
        if(isEmpty()){
            return;
        }

        ListNode current = front;

        while (current != null){
            System.out.print(current.data + " ---> ");

            current = current.next;
        }

        System.out.println("null");
    }


    // 1B deque operation to remove element from the front
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }

        int result = front.data;

        front = front.next;

        if(front == null){
            rear = null;
        }

        length--;

        return result;
    }

    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return rear.data;
    }


    public static void main(String[] args) {
        QueueEx queue = new QueueEx();

        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.print();

//        System.out.println("After calling the dequeue operation");
//
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();

       // queue.print();

        System.out.println(queue.first());
        System.out.println(queue.last());
    }
}
