package edu.senac.intro.aulas.vintequatro;

public class bidimensionalArray {

    static int[][] box = new int[4][];

    public static void main(String[] args) {

        for (int index = 0; index < box.length; index++) {
            box[index] = new int[index + 1];
        }

        for (int horizontalIndex = 0; horizontalIndex < box.length; horizontalIndex++) {

            System.out.println(horizontalIndex);
            System.out.println("-------------");

            for (int verticalIndex = 0; verticalIndex < box[horizontalIndex].length; verticalIndex++) {
                System.out.println(verticalIndex);
            }

            System.out.println("============");
        }


    }
}
