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
public class BonusUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário meu guerreiro?");
        double wage = sc.nextDouble(),
                bonus = (wage * 0.30) + wage;
        System.out.println("Seu salário de " + wage + " Reais, subiu para: " + bonus + " Reais. :)");
    }
}
