package aulas.sete.atv02;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "horse"};
        Map<Character, Integer> letterCount = CountEachLetter(words);

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> CountEachLetter(String[] words) {
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (String word : words) {
            for (char letter : word.toCharArray()) {
                letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
            }
        }

        return letterCountMap;
    }
}
