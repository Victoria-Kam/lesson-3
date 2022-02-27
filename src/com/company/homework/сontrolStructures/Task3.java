package com.company.homework.сontrolStructures;

/*
* 3. Напишите программу, которая будет принимать на вход число и на
     выход будет выводить сообщение четное число или нет.
     Для определения четности числа используйте операцию получения
     остатка от деления - операция выглядит так: '% 2').
* */

import java.util.Scanner;

public class Task3 {

    public void third() {

        int value;
        boolean stopCount = false;
        String answer = "";

        Scanner scan = new Scanner(System.in);

        while (!stopCount) {
            System.out.print("Введи число:");
            while (!scan.hasNextInt()) {
                System.out.println("Нужно целое число! Попробуй еще раз!");
                scan.next();
            }

            value = scan.nextInt();

            if (value % 2 == 0){
                System.out.println("Твое число четное!");
            }else{
                System.out.println("Твое число нечетное!");
            }

            System.out.println("Продолжить считать? (да/нет)");
            answer = scan.next();
            if (answer.equals("да")){
                continue;
            }else{
                stopCount = true;
            }
            System.out.println("Хорошего дня!");
        }
    }
}
