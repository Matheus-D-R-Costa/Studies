package edu.dio.aulas.filas;

public class Queue<T> {

    private Node<T> referenceNodeToJoinTheQueue;

    public Queue() {
        this.referenceNodeToJoinTheQueue = null;
    }

    public void enqueue(T object) {
        Node newNode = new Node(object);
        newNode.setReferenceNode(referenceNodeToJoinTheQueue);
        referenceNodeToJoinTheQueue = newNode;
    }

    public T dequeue() {

        if (!isEmpty()) {
            Node firstNode = referenceNodeToJoinTheQueue;
            Node assistantNode = referenceNodeToJoinTheQueue;
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
            Node firstNode = referenceNodeToJoinTheQueue;

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

    public boolean isEmpty() {
       return referenceNodeToJoinTheQueue == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node assistantNode = referenceNodeToJoinTheQueue;

        if (referenceNodeToJoinTheQueue != null) {
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
