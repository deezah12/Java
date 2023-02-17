package chapter16;

import java.util.Collections;
import java.util.PriorityQueue;

public class SortOrderPriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(2.3);
        queue.offer(4.4);
        queue.offer(8.5);
        queue.offer(5.5);

        System.out.println("Polling out in Descending order");

        while (queue.size() > 0){
            System.out.printf("%.1f ", queue.peek());
            queue.poll();

        }

    }
}
