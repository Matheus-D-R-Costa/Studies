package edu.dio.aulas.collections.map.orderned;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPages implements Comparator<Map.Entry<String, Books>> {
    @Override
    public int compare(Map.Entry<String, Books> b1, Map.Entry<String, Books> b2) {
        return Integer.compare(b1.getValue().getPages(), b2.getValue().getPages());
    }
}
