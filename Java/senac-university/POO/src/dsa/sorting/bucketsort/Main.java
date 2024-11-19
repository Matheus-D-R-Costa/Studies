package dsa.sorting.bucketsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Double[] avaliacoes = {3.2, 8.9, 5.1, 2.3, 7.8, 4.4, 1.9, 9.6, 0.2, 6.5};

        System.out.println(Arrays.toString(avaliacoes));
        BucketSort.bucketSort(avaliacoes);
        System.out.println(Arrays.toString(avaliacoes));
    }
}
