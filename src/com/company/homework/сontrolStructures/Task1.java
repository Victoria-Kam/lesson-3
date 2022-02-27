package com.company.homework.сontrolStructures;
/*
* 1. Написать программу для вывода названия поры года по номеру
     месяца.При решении используйте оператор switch-case.
* */

import java.util.Scanner;

public class Task1 {

    public void first() {

        int month = 0;
        boolean correctInput = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введи номер месяца");

        while (!correctInput) {
            while (!scan.hasNextInt()) {
                System.out.print("Ой! Введи целое число месяца: ");
                scan.next();
            }
            month = scan.nextInt();

            if (month <= 0 || month >= 13) {
                System.out.println("Введен неправильный номер месяца, попробуй еще раз!");
            } else {
                correctInput = true;
            }
        }
        switch (month) {
            case 1:
                System.out.println("Это январь");
                break;
            case 2:
                System.out.println("Это февраль");
                break;
            case 3:
                System.out.println("Это март!");
                break;
            case 4:
                System.out.println("Это апрель!");
                break;
            case 5:
                System.out.println("Это май!");
                break;
            case 6:
                System.out.println("Это июнь!");
                break;
            case 7:
                System.out.println("Это июль!");
                break;
            case 8:
                System.out.println("Это август!");
                break;
            case 9:
                System.out.println("Это сентябрь!");
                break;
            case 10:
                System.out.println("Это октябрь!");
                break;
            case 11:
                System.out.println("Это ноябрь!");
                break;
            case 12:
                System.out.println("Это декабрь!");
                break;
        }

    }
}
