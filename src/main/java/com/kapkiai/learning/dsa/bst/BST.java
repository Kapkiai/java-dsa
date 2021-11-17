package com.kapkiai.learning.dsa.bst;

public class BST {
    Node root;

    public BST(){
        root = null;
    }

    public void deleteKey(int key){
        root = deleteNode(root, key);
    }

    public Node deleteNode(Node root, int key){
        if (root == null){
            return root;
        }
        if (key < root.key){
            root.left = deleteNode(root.left, key);
        } else if (key > root.key){
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return  root.left;
            }

            root.key = minValue(root.right);

            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }

    private int minValue(Node root){
        if (root.left != null) {
            minValue(root.left);
        }
        return root.key;
    }

    public void insert(int key){
        root = insertRecursive(root, key);
    }

    private Node insertRecursive(Node root, int key){
        if ( root == null){
            return new Node(key);
        }

        if (key < root.key){
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key){
            root.right = insertRecursive(root.right, key);
        }
        return root;
    }

    public boolean search(int key){
        root = searchRecursive(root, key);
        return root != null;
    }

    private Node searchRecursive(Node root, int key){
        if (root == null || root.key == key){
            return root;
        }

        if (root.key < key){
            return searchRecursive(root.right, key);
        } else {
            return searchRecursive(root.left, key);
        }
    }


    /**
     * In order traversal
     */
    public void inorder(){
        inorderRecursive(root);
    }

    private void inorderRecursive(Node root){
        if(root != null) {
            inorderRecursive(root.left);
            System.out.println(root.key + " ");
            inorderRecursive(root.right);
        }

    }

    public void preorder(){
        preorderRecursive(root);
    }

    private void preorderRecursive(Node root){
        if (root != null){
            System.out.println(root.key + " ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    public void postorder(){

        postorderRecursive(root);
    }

    private void postorderRecursive(Node root){
        if (root == null) return;
        postorderRecursive(root.left);
        postorderRecursive(root.right);
        System.out.println(root.key + " here");

    }
}
