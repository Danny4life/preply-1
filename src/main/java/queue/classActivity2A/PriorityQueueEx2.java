package queue.classActivity2A;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
