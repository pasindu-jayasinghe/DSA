package challanges.java.hackerrank.datastructures.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LargestRectangle {

    private static Integer tempP,tempH;
    private static int maxSize;

    public static void main(String[] args) {
        List<Integer> h = Arrays.asList(3, 8, 6, 5, 7);
        long x = largestRectangle(h);
        System.out.println(x);
    }

    public static long largestRectangle(List<Integer> his) {
        Stack<Integer> hstack = new Stack<>();
        Stack<Integer> pstack = new Stack<>();
        int h ,pos;

        for(pos =0; pos<his.size(); pos++){
            h = his.get(pos);

            if(hstack.isEmpty() || h>hstack.peek() ){
                hstack.push(h);
                pstack.push(pos);
            }
            else if(h<hstack.peek()){
                while(!hstack.isEmpty() && h < hstack.peek()){
                    popThisElement(hstack,pstack,pos);
                }
                hstack.push(h);
                pstack.push(tempP);
            }
        }
        while (!hstack.isEmpty()){
            popThisElement(hstack,pstack,pos);
        }
        return maxSize;
    }

    private static void popThisElement(Stack<Integer> hstack, Stack<Integer> pstack, int pos) {
         tempH = hstack.pop();
         tempP = pstack.pop();
        System.out.println("pos: "+ pos + " tempP: "+ tempP);
        var tempSize = tempH * (pos-tempP);
        maxSize = Math.max(tempSize,maxSize);

    }


}