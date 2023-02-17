package chapter16;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityTest {
    public static void main(String[] args) {

        PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());


        priorityQueue.offer(3.2);
        priorityQueue.offer(9.8);
        priorityQueue.offer(5.4);

        while (priorityQueue.size() > 0){
            System.out.printf("%.1f ", priorityQueue.peek());
            priorityQueue.poll();

        }

    }
}
