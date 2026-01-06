package com.anwar.data_structure_and_algorithm.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                System.out.print(node.data+" ");
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(15);
        root.right=new Node(25);
        root.left.left=new Node(18);
        root.left.right=new Node(15);
        levelOrder(root);
    }
}
