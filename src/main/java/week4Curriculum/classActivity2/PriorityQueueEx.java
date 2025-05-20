package week4Curriculum.classActivity2;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();


        // on FIFO basis
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

        // to show the head of the element
//       System.out.println("head : " + queue.element());
//        System.out.println("head : " + queue.peek());


        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
