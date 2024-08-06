package com.learnJava.CollectionsPractice;

import java.util.PriorityQueue;

public class PriorityQueueExamples {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.offer(15);
        priorityQueue.offer(20);
        priorityQueue.offer(11);
        priorityQueue.offer(30);
        System.out.println(priorityQueue.poll());


        System.out.println(priorityQueue.peek());// smallest numbers hae higher priority



    }
}
