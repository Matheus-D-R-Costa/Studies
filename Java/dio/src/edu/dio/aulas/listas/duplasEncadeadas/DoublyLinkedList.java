package edu.dio.aulas.listas.duplasEncadeadas;

public class DoublyLinkedList<T> {

    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;

    private int listLength;

    public DoublyLinkedList() {
        firstNode = null;
        lastNode = null;
        listLength = 0;
    }

    public int size() {
        return listLength;
    }

    public void add(T content) {
        DoubleNode<T> newNode = new DoubleNode<>(content);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);

        if (firstNode == null) {
            firstNode = newNode;
        }

        if(lastNode != null) {
            lastNode.setNextNode(newNode);
        }

            lastNode = newNode;

        listLength++;

    }

    public void add(T content, int index) {
        DoubleNode<T> assistantNode = getNode(index);
        DoubleNode<T> newNode = new DoubleNode<>(content);
        newNode.setNextNode(assistantNode);

        if (newNode.getNextNode() != null) {
            newNode.setPreviousNode(assistantNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }

        if (index == 0) {
            firstNode = newNode;
        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }

        listLength++;
    }

    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.getNextNode();

            if (firstNode != null) {
                firstNode.setPreviousNode(null);
            }
        } else {
            DoubleNode<T> assistantNode = getNode(index);
            assistantNode.getPreviousNode().setNextNode(assistantNode.getNextNode());

            if (assistantNode != lastNode) {
                assistantNode.getNextNode().setPreviousNode(assistantNode.getPreviousNode());
            } else {
                lastNode = assistantNode;
            }
        }

        listLength--;

    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    private DoubleNode<T> getNode(int index) {
        DoubleNode<T> assistantNode = firstNode;

        for (int i = 0; (i < index) && (assistantNode != null); i++) {
            assistantNode = assistantNode.getNextNode();
        }

        return assistantNode;

    }

    @Override
    public String toString() {
        String stringReturn = "";

        DoubleNode<T> assistantNode = firstNode;

        for (int index = 0; index < size(); index++) {
            stringReturn += "[Node { content = " + assistantNode.getContent() + " }] -->";
            assistantNode = assistantNode.getNextNode();
        }

        stringReturn += "null";
        return stringReturn;

    }
}
