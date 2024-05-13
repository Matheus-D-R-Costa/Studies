package edu.dio.aulas.testes.Structures;

public class Stack<T> {

    private Node<T> refenreceInputNode;

    public Stack() {
        refenreceInputNode = null;
    }

    public Node<T> top() {
        return refenreceInputNode;
    }

    public void push(T object) {
        Node<T> newNode = new Node<>(object);
        Node<T> assitantNode = refenreceInputNode;
        refenreceInputNode = newNode;
        refenreceInputNode.setNextNode(assitantNode);
    }

    public Node<T> pop() {

        if (!isEmpty()) {
            Node<T> assistantNode = refenreceInputNode;
            refenreceInputNode = refenreceInputNode.getNextNode();
            return assistantNode;
        }

        return null;

    }

    private boolean isEmpty() {
        return (refenreceInputNode == null) ? true : false;
    }

    @Override
    public String toString() {
       String string = "------------\n";
       string += "Stack do pai\n";
       string += "------------\n";

       Node<T> assistantNode = refenreceInputNode;

       while (true) {
           if (assistantNode != null) {
               string += "[Node" +
                       "{Objeto = " + assistantNode.getObject() + "}]\n";
               assistantNode = assistantNode.getNextNode();
           } else {
               break;
           }
       }

       string += "============";
       return string;

    }
}
