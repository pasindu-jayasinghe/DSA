package com.dsa.queues;

import java.util.Arrays;

public class PriorityQueue {

    int[] items;
    int count;
    int rcount;
    public PriorityQueue(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if(isFull())
            throw new IllegalStateException();
        //shifting items
       var i = shiftItemsToInsert(item);
        items[i + 1] = item;
        count++;

    }

    public int remove(){
        //items[rcount++] = 0;
        //return items[count];
        //assumption to remove most priority number
        if(isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public int shiftItemsToInsert(int item){
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {

                break;
            }
        }
        return i;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
