package aulas.nove.atv01;

import java.util.PriorityQueue;
import java.util.Queue;

public class Calculator {

    private static class InstanceHolder {
        private static final Calculator INSTANCE = new Calculator();
    }

    public static Calculator getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private double result;
    private Queue<Double> history;

    private Calculator() {
        this.history = new PriorityQueue<>();
    }

    public double sum(double n1, double n2) {
        this.result = n1 + n2;
        history.add(result);
        return result;
    }

    public double divide(double n1, double n2) {
        this.result = n1 / n2;
        this.history.add(result);
        return result;
    }

    public  double multiply(double n1, double n2) {
        this.result = n1 * n2;
        this.history.add(result);
        return result;
    }

    public double subtract(double n1, double n2) {
        this.result = n1 - n2;
        this.history.add(result);
        return result;
    }

    public boolean isMajor(double n1, double n2) {
        return n1 > n2;
    }

    public void clearHistory() {
        this.history.clear();
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Queue<Double> getHistory() {
        return history;
    }

    public void setHistory(Queue<Double> history) {
        this.history = history;
    }
}
