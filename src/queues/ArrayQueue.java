package queues;

import java.util.Arrays;

//Implementing Queue using array (similar to ArrayDeque)
public class ArrayQueue {

    int[] items;
    int f = 0;//front
    int l = 0;//rear
    int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[l] = item;
        l = (l + 1) % items.length;
        count++;
    }

    public int remove() {
        var item = items[f];
        items[f] = 0;
        //circular array
        f = (f + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        //  var content = Arrays.copyOfRange(items,f,l);
        return Arrays.toString(items);
    }
}
