package com.kapkiai.learning.dsa.bst;

public class Driver {

    public static void main(String[] args){
        BST bst = new BST();
        /**
          BST tree example
              45
           /     \
          10      90
         /  \    /
        7   12  50
         */
        //insert data into BST
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(50);
        
        bst.preorder();
        bst.postorder();
        //Printing BST
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();

        //Deletion
        System.out.println("The BST after deletion:");
        bst.deleteKey(10);
        bst.inorder();

        System.out.println("Does key: " + 10 + " exists? " + bst.search(122));
    }
}
