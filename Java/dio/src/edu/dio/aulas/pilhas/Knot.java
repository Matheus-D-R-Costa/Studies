package edu.dio.aulas.pilhas;

public class Knot {

    private int data;
    private Knot nextReferanceKnot = null;

    public Knot(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Knot getNextReferanceKnot() {
        return nextReferanceKnot;
    }

    public void setNextReferanceKnot(Knot nextReferanceKnot) {
        this.nextReferanceKnot = nextReferanceKnot;
    }

    @Override
    public String toString() {
        return "Knot{" +
                "data=" + data +
                '}';
    }
}
