package com.company.homework.cycles;

/*
* 3. Напишите программу, где пользователь вводит любое целое
     положительное число. А программа суммирует все числа от 1 до
     введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.
* */

import java.util.Scanner;

public class Task3 {

    public void third() {

        int value = 0;
        int summ = 0;
        boolean correctImput = false;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введи целое положительное число: ");

        while (!correctImput) {
            while (!scan.hasNextInt()) {
                System.out.println("Введи целое число! Попробуй еще раз!");
                scan.next();
            }
            value = scan.nextInt();

            if (value <= 0) {
                System.out.println("Введи целое положительное число! Попробуй еще раз!");
            } else {
                correctImput = true;
            }
        }

        for (int i = 1; i < value; i++) {
            summ += i;
        }

        System.out.println("Сумма чисет от 1 до " + value + " равна " + summ);
    }
}
