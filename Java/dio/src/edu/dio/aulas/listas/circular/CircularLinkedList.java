package edu.dio.aulas.listas.circular;

public class CircularLinkedList<T> {

    private Node<T> tail;
    private Node<T> head;
    private int length;

    public CircularLinkedList() {
        this.tail = null;
        this.head = null;
        this.length = 0;
    }

    public T get(int index) {
        return getNode(index).getData();
    }

    private Node<T> getNode(int index) {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }

        if(index != 0) {
            Node<T> assistantNode = tail;

            for(int i = 0; i < index; i++) {
                assistantNode = assistantNode.getNextNode();
            }
            return assistantNode;
        } else {
            return tail;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = head;
            head.setNextNode(tail);
        } else {
            newNode.setNextNode(tail);
            head.setNextNode(newNode);
            tail = newNode;
        }

        length++;

    }

    public boolean isEmpty() {
        return (length == 0) ? true : false;
    }

    public void remove(int index) {
        if(index >= length) {
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");
        }

        Node<T> assistantNode = tail;

        if(index == 0) {
            tail = tail.getNextNode();
            head.setNextNode(tail);
        } else if(index == 1) {
            tail.setNextNode(tail.getNextNode().getNextNode());
        } else {
            for(int i = 0; i < index - 1; i++) {
                assistantNode = assistantNode.getNextNode();
            }

            assistantNode.setNextNode(assistantNode.getNextNode().getNextNode());

        }

        length--;

    }

    @Override
    public String toString() {
        String string = "";

        Node<T> assistantNode = tail;

        for(int i = 0; i < size(); i++) {
            string += "[Node{data=" + assistantNode.getData() + "}] -->";
            assistantNode = assistantNode.getNextNode();
        }

        string += size() != 0 ? "(retorna ao inicio)" : "[]";

        return string;

    }

    public int size() {
        return this.length;
    }
}
