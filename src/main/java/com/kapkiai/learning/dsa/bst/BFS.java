package com.kapkiai.learning.dsa.bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 * printLevelorder(tree)
 * 1) Create an empty queue q
 * 2) temp_node = root *start from root*
 *3)Loop while temp_node is not NULL
         *a)print temp_node->data.
         *b)Enqueue temp_node’s children
         *(first left then right children)to q
         *c)Dequeue a node from q.
 */
public class BFS {

    Node root;

    void printLevelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node tempNode = queue.poll();

            System.out.println("data = " + tempNode.key);

            if (tempNode.left != null){
                queue.add(tempNode.left);
            }

            if (tempNode.right != null){
                queue.add(tempNode.right);
            }

        }
    }

    public static void main(String[] args){
        /**
                 BST tree example
                   1
                 /    \
                 2     3
                 /  \    /
                 4   5  6
         */
        BFS tree_level = new BFS();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right = new Node(3);
        tree_level.root.left.right.left = new Node(8);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.left.left = new Node(7);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }

}
