/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.senac.intro.aulas.cinco.util;

import java.util.Scanner;

/**
 *
 * @author matheus.costa7
 */
public class BimestreUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quais Foram as suas 4 notas no Bimestre?");
        double note1 = sc.nextDouble(),
                note2 = sc.nextDouble(),
                note3 = sc.nextDouble(),
                note4 = sc.nextDouble(),
                finalResult = (note1 + note2 + note3 + note4) / 4;
        System.out.println("Sua média no final do bimestre foi de: " + finalResult);
    }
}
