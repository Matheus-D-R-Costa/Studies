package edu.dio.aulas.testes.Structures;

public class Node<T> {

    private T object;
    private Node<T> nextNode;

    public Node() {}

    public Node(T object) {
        this.object = object;
        this.nextNode = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
