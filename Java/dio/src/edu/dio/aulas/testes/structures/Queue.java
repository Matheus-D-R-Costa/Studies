package edu.dio.aulas.testes.structures;

import edu.dio.aulas.filas.Node;

public class Queue<T> {

    private Node<T> referenceInputQueue;

    public Queue() {
        referenceInputQueue = null;
    }

    public void enqueue(T object) {
        Node<T> newNode = new Node<>(object);
        newNode.setReferenceNode(referenceInputQueue);
        referenceInputQueue = newNode;
    }

    public T dequeue() {

        if (!isEmpty()) {
            Node<T> firstNode = referenceInputQueue;
            Node<T> assistantNode = referenceInputQueue;

            while (true) {
                if (firstNode.getReferenceNode() != null) {
                    assistantNode = firstNode;
                    firstNode = firstNode.getReferenceNode();
                } else {
                    assistantNode.setReferenceNode(null);
                    break;
                }
            }

            return (T) firstNode.getObject();

        }

        return null;

    }

    public T first() {

        if (!isEmpty()) {
            Node<T> firstNode = referenceInputQueue;

            while (true) {
                if (firstNode.getReferenceNode() != null) {
                    firstNode = firstNode.getReferenceNode();
                } else {
                    break;
                }
            }

            return (T) firstNode.getObject();

        }

        return null;

    }

    private boolean isEmpty() {
        return (referenceInputQueue == null) ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node assistantNode = referenceInputQueue;

        if (referenceInputQueue != null) {
            while (true) {
                stringReturn += "[Node {objeto = " + assistantNode.getObject() + "}] -->";

                if (assistantNode.getReferenceNode() != null) {
                    assistantNode = assistantNode.getReferenceNode();

                } else {
                    stringReturn += "null";
                    break;
                }
            }
        } else {
            stringReturn = "null";
        }
        return stringReturn;
    }
}
