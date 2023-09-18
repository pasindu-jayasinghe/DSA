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
    //no need this when child set inside the while()
    public boolean isChildNull(Node right , Node left){
        return  (right != null && left != null);
    }



}
