package queues;

public class ArrayQueueImplement {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.remove();
        queue.add(450);

        System.out.println(queue);
    }
}
