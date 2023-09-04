package com.dsa.queues;
import java.util.ArrayDeque;
import java.util.Queue;


public class Queues_1 {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.remove();
        System.out.println(queue);

    }
}
