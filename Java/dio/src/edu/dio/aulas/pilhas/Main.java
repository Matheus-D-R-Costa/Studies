package edu.dio.aulas.pilhas;

public class Main {

    static Stack myStack = new Stack();

    public static void main(String[] args) {

        myStack.push(new Knot(1));
        myStack.push(new Knot(2));
        myStack.push(new Knot(3));
        myStack.push(new Knot(4));
        myStack.push(new Knot(5));
        myStack.push(new Knot(6));
        System.out.println(myStack);

        System.out.println(myStack.pop());
        System.out.println(myStack);

        myStack.push(new Knot(99));
        System.out.println(myStack);

    }
}
