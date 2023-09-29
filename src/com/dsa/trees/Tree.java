package com.dsa.trees;

public class Tree {

    private class Node{
        private int value;
        private  Node leftChild;
        private  Node rightChild;
        public Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node=" + value;
        }

    }
    private Node root;
    public void insert(int item){
        Node node = new Node(item);
        if(root == null){
            root = node;
            return;
        }
        var current = root;
            while (true){
                if(item>current.value){
                    if(current.rightChild == null){
                        current.rightChild = node;
                        break;
                    }
                    current = current.rightChild;
                }else if(item<current.value){
                    if(current.leftChild == null){
                        current.leftChild = node;
                        break;
                    }
                    current = current.leftChild;
                }
        }

    }

    public boolean find(int item){
        var current = root;
        while (current != null){
             if(item>current.value){
                current = current.rightChild;
            }else if(item<current.value){
                current = current.leftChild;
            }else{
                 return true;
             }
        }
        return false;
    }

    public void traversePostOrder(){
        //traversePreOrder(root);
        // traverseInOrder(root);
        traversePostOrder(root);
    }
    private void traversePreOrder(Node root){
        if(root == null)
            return;

         System.out.println(root.value);
         traversePreOrder(root.leftChild);
         traversePreOrder(root.rightChild);
    }
    private void traverseInOrder(Node root){
        if(root == null)
                return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    private void traversePostOrder(Node root){
        if(root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }
    private int height(Node root){

        if(root == null)
            return -1;

        if(isLeaf(root))
            return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));

    }

    //If Tree is BST, can find min from this
    public int minBST(){
        if(root == null)
            throw new IllegalStateException();

        var current = root;
        var last = current;
        while (current != null){
            last = current;
            current = current.leftChild;
        }
        return last.value;

    }

    public int min(){
        return min(root);
    }
    private int min(Node root){
        if(isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left,right),root.value);
    }

    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }


    //no need this when child set inside the while()
    public boolean isChildNull(Node right , Node left){
        return  (right != null && left != null);
    }

}
