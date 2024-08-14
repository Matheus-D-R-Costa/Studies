package edu.dio.aulas.ordenacao;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] toBobbleSortArray = {3, 5, 1, 4, 2, 8, 10, 7, 6};
        int[] toQuickSortArray = {3, 5, 1, 4, 2, 8, 10, 7, 6};
        int[] toMergeSort = {3, 5, 1, 4, 2, 8, 10, 7, 6};

        System.out.println(Arrays.toString(Ordenator.bobbleSort(toBobbleSortArray)));
        System.out.println(Arrays.toString(Ordenator.quickSort(toQuickSortArray)));
        System.out.println(Arrays.toString(Ordenator.mergeSort(toMergeSort)));

    }
}
