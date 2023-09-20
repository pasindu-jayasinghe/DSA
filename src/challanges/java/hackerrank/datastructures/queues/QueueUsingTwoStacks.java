package challanges.java.hackerrank.datastructures.queues;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int type = sc.nextInt();
            if(type == 1){
                int x = sc.nextInt();
                queue.enqueue(x);
            }
            else if(type == 2){
                queue.dequeue();
            }
            else if(type == 3){
                System.out.println(queue.peek());
            }
        }
        sc.close();
    }
}
class Queue<T> {
    Stack<T> leftStack = new Stack<>();
    Stack<T> rightStack = new Stack<>();
    void enqueue(T item){
        leftStack.push(item);
    }
    T dequeue(){
        transferIfNeeded();
        return rightStack.pop();
    }
    T peek(){
        transferIfNeeded();
        return rightStack.peek();
    }
    void transferIfNeeded(){
        if(rightStack.empty()){
            while(!leftStack.isEmpty()){
                rightStack.push(leftStack.pop());
            }
        }
    }
}
