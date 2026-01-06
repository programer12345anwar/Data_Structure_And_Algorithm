package com.anwar.data_structure_and_algorithm.Trees;

public class CreateTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    static void printTree(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(15);
        root.right=new Node(25);
        root.left.left=new Node(18);
        root.left.right=new Node(15);
        printTree(root);
    }
}
