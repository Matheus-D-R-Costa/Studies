package edu.dio.aulas.nos;

public class Knot<T> {

    private T knotContent;
    private Knot<T> nextKnot;

    public Knot(T knotContent) {
        this.knotContent = knotContent;
        this.nextKnot = null;
    }

    public T getKnotContent() {
        return knotContent;
    }

    public void setKnotContent(T knotContent) {
        this.knotContent = knotContent;
    }

    public Knot<T> getNextKnot() {
        return nextKnot;
    }

    public void setNextKnot(Knot<T> nextKnot) {
        this.nextKnot = nextKnot;
    }

    @Override
    public String toString() {
        return "knotContent{" +
                "knotContent='" + knotContent + '\'' +
                '}';
    }
}
