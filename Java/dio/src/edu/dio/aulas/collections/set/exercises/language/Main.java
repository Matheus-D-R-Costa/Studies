package edu.dio.aulas.collections.set.exercises.language;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<ProgrammingLanguage> programmingLanguagesInLinkedHashSet = new LinkedHashSet<>(){{
            add(new ProgrammingLanguage("Java", 1991, "IntelliJ"));
            add(new ProgrammingLanguage("Rust", 2010, "Neovim"));
            add(new ProgrammingLanguage("C", 1972, "NetBins"));
        }};

        System.out.println();
        System.out.println("--\t Ordem de Inserção\t--");
        printer(programmingLanguagesInLinkedHashSet);

        System.out.println();
        System.out.println("--\t Ordem Natural (nome)\t--");
        Set<ProgrammingLanguage> programmingLanguagesInTreeSet = new TreeSet<>(programmingLanguagesInLinkedHashSet);
        printer(programmingLanguagesInTreeSet);

        System.out.println();
        System.out.println("--\tOrdem por IDE --\t--");
        Set<ProgrammingLanguage> programmingLanguagesIn_IDE_Order = new TreeSet<>(new ComparatorIDE());
        programmingLanguagesIn_IDE_Order.addAll(programmingLanguagesInLinkedHashSet);
        printer(programmingLanguagesIn_IDE_Order);

        System.out.println();
        System.out.println("--\tOrdem por Nascimento\t--");
        Set<ProgrammingLanguage> programmingLanguagesInYearOfBornOrder = new TreeSet<>(new ComparatorYearOfBorn());
        programmingLanguagesInYearOfBornOrder.addAll(programmingLanguagesInLinkedHashSet);
        printer(programmingLanguagesInYearOfBornOrder);

    }

    static void printer(Set<ProgrammingLanguage> programmingLanguages) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }
    }
}
