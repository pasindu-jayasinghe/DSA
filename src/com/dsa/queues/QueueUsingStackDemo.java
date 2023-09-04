package com.dsa.queues;

public class QueueUsingStackDemo {

    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.remove();



        System.out.println(queue);

    }
}
