package com.company.homework.сontrolStructures;

/*2. Написать программу для вывода названия поры года по номеру
     месяца. При решении используйте оператор if-else-if.
*
* */

import java.util.Scanner;

public class Task2 {

    public void second() {

        int month = 0;
        boolean correctImput = false;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введи номер месяца: ");

        while (!correctImput) {                         // для проверки ввода
            while (!scan.hasNextInt()) {
                System.out.println("Неправильный ввод! Введи целое число!");
                scan.next();
            }
            month = scan.nextInt();

            if (month <= 0 || month > 13) {
                System.out.println("Неверный ввод! Введи номер месяца!");
            } else {
                correctImput = true;
            }
        }

        if ((month == 12) || (month == 1) || (month == 2)) {
            System.out.println("Сезон введенного номера месяца - Зима!");
        } else if ((month == 3) || (month == 4) || (month == 5)){
            System.out.println("Сезон введенного номера месяца - Весна!");
        } else if ((month == 6) || (month == 7) || (month == 8)){
            System.out.println("Сезон введенного номера месяца - Лето!");
        } else if((month == 9) || (month == 10) || (month == 11)){
            System.out.println("Сезон введенного номера месяца - Осень!");
        }
    }

}
