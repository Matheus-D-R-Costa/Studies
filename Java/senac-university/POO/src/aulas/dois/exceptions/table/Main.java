package aulas.dois.exceptions.table;

public class Main {

    public static void main(String[] args) {
        getMultiplicationTable(5);
    }

    public static void getMultiplicationTable(int target) {

        for (int idx = 1; idx <= 10; idx++) {
            System.out.println(target + "x" + idx + " = " + target * idx);
        }

    }
}
