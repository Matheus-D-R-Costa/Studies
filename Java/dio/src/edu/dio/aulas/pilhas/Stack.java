package edu.dio.aulas.pilhas;

public class Stack {

    private Knot referenceKnotInInputStack;

    public Stack() {
        this.referenceKnotInInputStack = null;
    }

    public Knot pop() {
        if(!isEmpty()) {
            Knot knotPoped = referenceKnotInInputStack;
            referenceKnotInInputStack = referenceKnotInInputStack.getNextReferanceKnot();
            return knotPoped;
        }

        return null;
    }

    public void push(Knot newKnot) {
        Knot referenceAssistant = referenceKnotInInputStack;
        referenceKnotInInputStack = newKnot;
        referenceKnotInInputStack.setNextReferanceKnot(referenceAssistant);
    }

    public Knot top() {
        return referenceKnotInInputStack;
    }

    public boolean isEmpty() {
        return referenceKnotInInputStack == null ? true : false;
    }

    @Override
    public String toString() {

        String returnString = "------------\n";
        returnString += "    Pilha\n";
        returnString += "------------\n";

        Knot assitantKnot = referenceKnotInInputStack;

        while (true) {
            if (assitantKnot != null) {
                returnString += "[Knot{dado=" + assitantKnot.getData() + "}]\n";
                assitantKnot = assitantKnot.getNextReferanceKnot();
            } else {
                break;
            }
        }
        returnString += "============\n";
        return returnString;
    }
}