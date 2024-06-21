package edu.dio.aulas.collections.map.challenge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    static Dice dice = new Dice();
    static Map<String, Integer> diceRolls = new LinkedHashMap<>() {{
        put("Ubs", 0);
        put("Two", 0);
        put("Three", 0);
        put("Fours", 0);
        put("Fives", 0);
        put("Six", 0);
    }};

    public static void main(String[] args) {


        rollHundredTimes(dice);

        int sum = 0;
        for(String face : diceRolls.keySet()) {
            System.out.println("Face do dado: " + face + " valor: " + diceRolls.get(face));
            sum += diceRolls.get(face);
        }

        System.out.println(sum);

    }

    static void rollHundredTimes(Dice dice) {
        for (int times = 0; times < 100; times++) {
            stockRolls(dice.getNumber());
        }
    }

    static void stockRolls(int roll) {
        switch (roll) {
            case 1:
                diceRolls.put("Ubs", diceRolls.get("Ubs") + 1);
                break;
            case 2:
                diceRolls.put("Two", diceRolls.get("Two") + 1);
                break;
            case 3:
                diceRolls.put("Three", diceRolls.get("Three") + 1);
                break;
            case 4:
                diceRolls.put("Fours", diceRolls.get("Fours") + 1);
                break;
            case 5:
                diceRolls.put("Fives", diceRolls.get("Fives") + 1);
                break;
            case 6:
                diceRolls.put("Six", diceRolls.get("Six") + 1);
                break;
        }
    }

}
