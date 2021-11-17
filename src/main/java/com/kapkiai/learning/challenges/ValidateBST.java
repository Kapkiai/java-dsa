package com.kapkiai.learning.challenges;

// Given a binary tree, determine if it is a valid binary search tree (BST).

// Assume a BST is defined as follows:

// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.
// Example 1:
//     2
//    / \
//   1   3
// Binary tree [2,1,3], return true.
// Example 2:
//     1
//    / \
//   2   3
// Binary tree [1,2,3], return false.

import com.kapkiai.learning.dsa.bst.BFS;
import com.kapkiai.learning.dsa.bst.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class ValidateBST {

    Node root;

    public static void main(String[] args){
        /**
         BST tree example
         1
         /    \
         2     3
         /  \    /
         4   5  6
         */
        ValidateBST tree_level = new ValidateBST();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(1);
        tree_level.root.right = new Node(3);
        tree_level.root.left.right = new Node(4);
//        tree_level.root.left.right.left = new Node(2);

        System.out.println(isValidBST(tree_level.root));
        System.out.println(isValidBST2(tree_level.root));
        System.out.println( 5 | 3);
        /*
        000 - 0
        001 - 1
        010 - 2
        011 - 3
        100 - 4
        101 - 5
        110 - 6
        111 - 7
         */

    }

    //Not that accurate
    static boolean isValidBST(Node root){
        //using BFS to validate
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean left = false;
        boolean right = false;

        while (!queue.isEmpty()){
            Node tempNode = queue.poll();

            if (tempNode.left != null){
                System.out.println("Root: " + tempNode.key + " Left: " + tempNode.left.key);
                if (tempNode.key > tempNode.left.key){
                    left = true;
                    queue.add(tempNode.left);
                } else {
                   return false;
                }
            }

            if (tempNode.right != null){
                System.out.println("Root: " + tempNode.key + " Right: " + tempNode.right.key);
                if (tempNode.key < tempNode.right.key){
                    right = true;
                    queue.add(tempNode.right);
                } else {
                    return false;
                }
            }
        }

        return right && left;
    }

    //Method  2 without using bfs

    static boolean isValidBST2(Node root) {
        if(root == null) {
            return true;
        }

        return validBSTRecursive(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean validBSTRecursive(Node root, long minValue, long maxValue) {
        if(root == null) {
            return true;
        } else if(root.key >= maxValue || root.key <= minValue) {
            return false;
        } else {
            return validBSTRecursive(root.left, minValue, root.key) && validBSTRecursive(root.right, root.key, maxValue);
        }
    }

}
