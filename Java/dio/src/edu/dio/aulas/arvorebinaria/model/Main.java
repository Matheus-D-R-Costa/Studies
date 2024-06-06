package edu.dio.aulas.arvorebinaria.model;

import edu.dio.aulas.arvorebinaria.BinaryTree;

public class Main {

    static BinaryTree<Object> myBinaryTree = new BinaryTree<>();

    public static void main(String[] args) {

        myBinaryTree.post(new Object(13));
        myBinaryTree.post(new Object(25));
        myBinaryTree.post(new Object(2));
        myBinaryTree.post(new Object(4));
        myBinaryTree.post(new Object(21));
        myBinaryTree.post(new Object(3));
        myBinaryTree.post(new Object(8));

        myBinaryTree.showInOrder();
        myBinaryTree.showPostOrder();
        myBinaryTree.showPreOrder();

    }
}
