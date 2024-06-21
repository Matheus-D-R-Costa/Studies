package edu.dio.aulas.collections.map.orderned;

import java.util.*;

public class OrdernedBooksExample {

    static Map<String, Books> booksInHashMaps = new HashMap<>(){{
        put("Friedrich Nietzsche ", new Books("Assim falou Zaratustra", 544));
        put("Gary Chapman ", new Books("As 5 Linguagens do Amor", 244));
        put("Andrew Hunt & David Thomas ", new Books("O programador Pragmático", 352));
    }};

    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t--");
        printer(booksInHashMaps);

        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Books> booksInLinkedHashMap = new LinkedHashMap<>(booksInHashMaps);
        printer(booksInLinkedHashMap);

        System.out.println("--\tOrdem Alfabética Autores\t--");
        Map<String, Books> booksInTreeMap = new TreeMap<>(booksInHashMaps);
        printer(booksInTreeMap);

        System.out.println("--\tOrdem Alfabética dos Nomes dos Livros.");
        Set<Map.Entry<String, Books>> booksInNameOrder = new TreeSet<>(new ComparatorNames());
        booksInNameOrder.addAll(booksInHashMaps.entrySet());
        printer(booksInNameOrder);

        System.out.println("--\tOrdem Número de Páginas\t--");
        Set<Map.Entry<String, Books>> booksInPageOrder = new TreeSet<>(new ComparatorPages());
        booksInPageOrder.addAll(booksInHashMaps.entrySet());
        printer(booksInPageOrder);
    }

    static void printer(Map<String, Books> books) {
        Set<Map.Entry<String, Books>> entries = books.entrySet();
        printer(entries);
    }

    static void printer(Set<Map.Entry<String, Books>> books) {

        for (Map.Entry<String, Books> book : books) {
            System.out.println(book);
        }

        System.out.println();
    }

}
