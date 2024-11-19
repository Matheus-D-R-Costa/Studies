package dsa.sorting.bucketsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static <T extends Comparable<T>> void bucketSort(T[] array) {
        if (array.length <= 1) return;

        T max = array[0];
        T min = array[0];
        for (T num : array) {
            if (num.compareTo(max) > 0) max = num;
            if (num.compareTo(min) < 0) min = num;
        }

        int bucketCount = array.length;
        List<List<T>> buckets = new ArrayList<>(bucketCount);

        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (T num : array) {
            int bucketIndex = (int) (((double) (num.compareTo(min)) / (max.compareTo(min))) * (bucketCount - 1));
            buckets.get(bucketIndex).add(num);
        }

        for (List<T> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<T> bucket : buckets) {
            for (T num : bucket) {
                array[index++] = num;
            }
        }
    }

}
