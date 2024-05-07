package edu.dio.aulas.filas;

public class Node<T> {

    private T object;
    private Node<T> referenceNode;

    public Node() {}

    public Node(T object) {
        this.object = object;
        this.referenceNode = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getReferenceNode() {
        return referenceNode;
    }

    public void setReferenceNode(Node referenceNode) {
        this.referenceNode = referenceNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
