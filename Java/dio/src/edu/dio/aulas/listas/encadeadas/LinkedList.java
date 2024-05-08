package edu.dio.aulas.listas.encadeadas;

public class LinkedList<T> {

    Node<T> referenceNodeToJoinTheLinkedList;

    public LinkedList() {
        this.referenceNodeToJoinTheLinkedList = null;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);

        if (this.isEmpty()) {
            referenceNodeToJoinTheLinkedList = newNode;
            return;
        }

        Node<T> assistantNode = referenceNodeToJoinTheLinkedList;
        for (int index = 0; index < this.size() - 1; index++) {
            assistantNode = assistantNode.getNextNode();
        }

        assistantNode.setNextNode(newNode);
    }

    public boolean isEmpty() {
        return (referenceNodeToJoinTheLinkedList == null) ? true : false;
    }

    public T remove(int index) {
        Node<T> pivotNode = this.getNode(index);

        if (index == 0) {
            referenceNodeToJoinTheLinkedList = pivotNode.getNextNode();
            return pivotNode.getContent();
        }

        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(pivotNode.getNextNode());
        return pivotNode.getContent();
    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index) {
        indexValidator(index);

        Node<T> assistantNode = referenceNodeToJoinTheLinkedList;
        Node<T> returnNode = null;

        for (int i = 0; i <= index; i++) {
            returnNode = assistantNode;
            assistantNode = assistantNode.getNextNode();
        }
        return returnNode;
    }

    private void indexValidator(int index) {
        if(index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índeice " + index + " desta lista. Esta lista só vai até o índice " + lastIndex + ".");
        }
    }

    public int size() {
        int lenght = 0;
        Node<T> assistantReference = referenceNodeToJoinTheLinkedList;

        while (true) {

            if (assistantReference != null) {
                lenght++;

                if(assistantReference.getNextNode() != null) {
                    assistantReference = assistantReference.getNextNode();
                } else {
                    break;
                }

            } else {
                break;
            }
        }
        return lenght;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> assitantNode = referenceNodeToJoinTheLinkedList;

        for (int index = 0; index < this.size(); index++) {
            returnString += "[Node {content = " + assitantNode.getContent() + "}] -->";
            assitantNode = assitantNode.getNextNode();
        }

        returnString += "null";

        return returnString;
    }
}
