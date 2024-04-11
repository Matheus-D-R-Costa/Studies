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
public class SumUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o número x");
        double note1 = sc.nextDouble();
        System.out.println("Escreva o número y");
        double note2 = sc.nextDouble(),
                sum = note1 + note2;
        System.out.println("A soma de de " + note1 + " + " + note2 + " é " + sum);
    }
}
