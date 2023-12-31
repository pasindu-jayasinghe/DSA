package com.dsa.trees;

public class TreeDemo {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);
//        tree.traversePostOrder();
//        System.out.println(tree.height());
//        System.out.println(tree.min());
//        System.out.println(tree.equals(tree2));
        tree.swapRoot();
        System.out.println(tree.isBST());
      var list =  tree.getNodesAtDistance(1);
      for (var item : list){
          System.out.println(item);
      }
      tree.traverseLevelOrder();

    }

}
