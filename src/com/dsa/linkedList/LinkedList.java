package com.dsa.linkedList;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        node.next = first;
        first = node;
    }
    private boolean isEmpty(){
    return  first == null;
    }
}
