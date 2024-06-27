package edu.dio.aulas.collections.stream.methods;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToLongFunction;

public class Main {

    static Map<Integer, Contact> agenda = new HashMap<>() {{
        put(6945, new Contact("Jake", 4891663049L));
        put(8678, new Contact("Josiane Mãe", 4884799394L));
        put(2345, new Contact("Andre Pai", 4884212429L));
    }};

    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        printer(agenda);

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contact> agendaInOrder = new LinkedHashMap<>();
        agendaInOrder.put(6945, new Contact("Jake", 4891663049L));
        agendaInOrder.put(8678, new Contact("Josiane Mãe", 4884799394L));
        agendaInOrder.put(2345, new Contact("Andre Pai", 4884212429L));
        printer(agendaInOrder);

        System.out.println("--\tOrdem Id\t--");
        Map<Integer, Contact> agendaInIdOrder = new TreeMap<>(agenda);
        printer(agendaInIdOrder);

        System.out.println("--\tOrdem Número de Telefone\t--");
//        // utilizando classe anônima
//        Set<Map.Entry<Integer, Contact>> agendaInNumberOrder = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contact> contact1, Map.Entry<Integer, Contact> contact2) {
//                return Long.compare(contact1.getValue().getNumber(), contact2.getValue().getNumber());
//            }
//        });

//        // utilizando functional Interface
//        Set<Map.Entry<Integer, Contact>> agendaInNumberOrder = new TreeSet<>(Comparator.comparingLong(
//                new ToLongFunction<Map.Entry<Integer, Contact>>() {
//                    @Override
//                    public long applyAsLong(Map.Entry<Integer, Contact> contact) {
//                        return contact.getValue().getNumber();
//                    }
//                }
//        ));

        // utilizando lambda
        Set<Map.Entry<Integer, Contact>> agendaInNumberOrder = new TreeSet<>(Comparator.comparingLong(contact -> contact.getValue().getNumber()));
        agendaInNumberOrder.addAll(agenda.entrySet());
        printer(agendaInNumberOrder);

        System.out.println("--\tOrdem por Nome\t--");
//        // utilizando classe anônima
//        Set<Map.Entry<Integer, Contact>> agendaInNameOrder = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contact> c1, Map.Entry<Integer, Contact> c2) {
//                return c1.getValue().getName().compareToIgnoreCase(c2.getValue().getName());
//            }
//        });

//        // utilizando functional interface
//        Set<Map.Entry<Integer, Contact>> agendaInNameOrder = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer, Contact>, String>() {
//                    @Override
//                    public String apply(Map.Entry<Integer, Contact> contact) {
//                        return contact.getValue().getName();
//                    }
//                }
//        ));

        // utilizando lambda
        Set<Map.Entry<Integer, Contact>> agendaInNameOrder = new TreeSet<>(Comparator.comparing(contact -> contact.getValue().getName()));
        agendaInNameOrder.addAll(agenda.entrySet());
        printer(agendaInNameOrder);

    }

    static void printer(Map<Integer, Contact> contacts) {
        Set<Map.Entry<Integer, Contact>> entries = contacts.entrySet();

        printer(entries);
    }

    static void printer(Set<Map.Entry<Integer, Contact>> contact) {

        for (Map.Entry<Integer, Contact> entry : contact) {
            System.out.println(entry.getKey() + "# - name = " + entry.getValue().getName() + " - número = " + entry.getValue().getNumber());
        }

        System.out.println();
    }
}
