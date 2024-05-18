package edu.dio.aulas.testes.structures;

public class Workbench {


    static Stack<String> myStack = new Stack<>();
    static Queue<Integer> myQueue = new Queue<>();

    public static void main(String[] args) {
        myStack.push("Cavalo");
        myStack.push("Talita");
        myStack.push("Neymar");
        System.out.println(myStack);

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        System.out.println(myQueue);
    }
}
