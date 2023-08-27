package queues;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);

        queue.add(7);
        queue.add(2);
        queue.add(2);


        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
