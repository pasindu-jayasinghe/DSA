package queues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/*Queues - Data structure like Stacks
 *(Like people queue, people join from the back leave from the front)
 *FIFO - First In First Out
 * Uses....
     * printers
     * Operating sys
     * web servers(managing incoming requests)
     * Live Support Systems
 * Operations
     * enqueue()
     * dequeue()
     * peek()
     * isEmpty()
     * isFull()
 isFull()
 */
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
