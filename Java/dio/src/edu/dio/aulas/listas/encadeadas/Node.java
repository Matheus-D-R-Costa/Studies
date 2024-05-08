package edu.dio.aulas.listas.encadeadas;

public class Node<T> {

    private T content;
    private Node nextNode;

    public Node() {}

    public Node(T content) {
        this.content = content;
        this.nextNode = null;
    }

    public Node(T content, Node nextNode) {
        this.content = content;
        this.nextNode = nextNode;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }

    public String toStringLinkedList() {
        String string = "Node{" +
                "content=" + content +
                '}';

        if(nextNode != null) {
            string += "--> " + nextNode.nextNode.toString();
        } else {
            string += "--> null";
        }
        return string;
    }
}
