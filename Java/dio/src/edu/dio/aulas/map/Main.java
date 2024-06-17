package edu.dio.aulas.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static Map<String, String> student = new HashMap<>();
    static Map<String, String> student2 = new HashMap<>();
    static List<Map<String, String>> studentsList = new ArrayList<Map<String, String>>();

    public static void main(String[] args) {

        student.put("Nome", "Jamelão");
        student.put("idade", "19");
        student.put("media", "7.35");
        student.put("turma", "35-B");

        System.out.println(student.keySet());

        studentsList.add(student);

        student2.put("Nome", "Jebaldo");
        student2.put("idade", "21");
        student2.put("media", "3");
        student2.put("turma", "35-B");

        System.out.println(student2.values());

        studentsList.add(student2);

        System.out.println(studentsList);

        System.out.println(student.containsKey("Nome"));
        System.out.println(student.containsKey("Name"));
    }

}
