package edu.dio.aulas.collections.map.orderned;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNames implements Comparator<Map.Entry<String, Books>> {

    @Override
    public int compare(Map.Entry<String, Books> b1, Map.Entry<String, Books> b2) {
        return b1.getValue().getName().compareToIgnoreCase(b2.getValue().getName());
    }
}
