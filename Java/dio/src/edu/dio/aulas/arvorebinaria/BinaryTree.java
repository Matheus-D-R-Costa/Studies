package edu.dio.aulas.arvorebinaria;

public class BinaryTree<T  extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void post(T content) {
        BinaryNode<T> newBinaryNode = new BinaryNode<>(content);
        root = post(root, newBinaryNode);
    }

    private BinaryNode<T> post(BinaryNode<T> currentBinaryNode, BinaryNode<T> newBinaryNode) {
        if (currentBinaryNode == null) {
            return newBinaryNode;
        } else if (newBinaryNode.getContent().compareTo(currentBinaryNode.getContent()) < 0) {
            currentBinaryNode.setLeftNode(post(currentBinaryNode.getLeftNode(), newBinaryNode));
        } else {
            currentBinaryNode.setRightNode(post(currentBinaryNode.getRightNode(), newBinaryNode));
        }

        return currentBinaryNode;

    }

    public void showInOrder() {
        System.out.println("\n Exibindo InOrder");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> currentBinaryNode) {
        if (currentBinaryNode != null) {
            showInOrder(currentBinaryNode.getLeftNode());
            System.out.println(currentBinaryNode.getContent() + ", ");
            showInOrder(currentBinaryNode.getRightNode());
        }
    }

    public void showPostOrder() {
        System.out.println("\n Exibindo PostOrder");
        showPostOrder(this.root);
    }

    private void showPostOrder(BinaryNode<T> currentBinaryNode) {
        if (currentBinaryNode != null) {
            showPostOrder(currentBinaryNode.getLeftNode());
            showPostOrder(currentBinaryNode.getRightNode());
            System.out.println(currentBinaryNode.getContent() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println("\n Exibindo PreOrder");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinaryNode<T> currentBinaryNode) {
        if (currentBinaryNode != null) {
            System.out.println(currentBinaryNode.getContent() + ", ");
            showPreOrder(currentBinaryNode.getLeftNode());
            showPreOrder(currentBinaryNode.getRightNode());
        }
    }

}
