package com.kapkiai.learning.dsa.bst;

public class Node {
    public int key;
    public Node left, right;

    public Node(int data){
        this.key = data;
        left = right = null;
    }
}
