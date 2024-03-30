/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author matheus.costa7
 */
public class Square02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um número para solicitar seu quadrado:");
        float number = sc.nextFloat(),
                calcSquare = number * 2;
        System.out.println("O quadrado de " + number + " é " + calcSquare);
    }
}
