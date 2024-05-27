package edu.senac.intro.aulas.vintequatro;

import java.util.Scanner;

public class Calendar {

    static Scanner scanner = new Scanner(System.in);
    static int[][] months = new int[12][];
    static String monthName;
    static String monthOption;

    public static void main(String[] args) {

        while (true) {
            System.out.println("Digite o número de um mês para ver seu número de dias.");
            monthOption = scanner.next();

            switch (monthOption) {

                case "1":
                    months[Integer.parseInt(monthOption)] = new int[31];
                    monthName = "January";
                    break;
                case "2":
                    months[Integer.parseInt(monthOption)] = new int[29];
                    monthName = "February";
                    break;
                case "3":
                    months[Integer.parseInt(monthOption)] = new int[31];
                    monthName = "March";
                    break;
                case "4":
                    months[Integer.parseInt(monthOption)] = new int[30];
                    monthName = "April";
                    break;
                case "5":
                    months[Integer.parseInt(monthOption)] = new int[31];
                    monthName = "May";
                    break;
                case "6":
                    months[Integer.parseInt(monthOption)] = new int[30];
                    monthName = "June";
                    break;
                case "7":
                    months[Integer.parseInt(monthOption)] = new int[31];
                    monthName = "July";
                    break;
                case "8":
                    months[Integer.parseInt(monthOption)] = new int[31];
                    monthName = "August";
                    break;
                case "9":
                    months[Integer.parseInt(monthOption)] = new int[30];
                    monthName = "September";
                    break;
                case "10":
                    months[Integer.parseInt(monthOption)] = new int[31];
                    monthName = "October";
                    break;
                case "11":
                    months[Integer.parseInt(monthOption)] = new int[30];
                    monthName = "November";
                    break;
                case "12":
                    months[Integer.parseInt(monthOption)] = new int[31];
                    monthName = "December";
                    break;
            }

            System.out.println("[ " + monthName + " { " + months[Integer.parseInt(monthOption)].length + " dias } ]" );

        }
    }
}
