package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // 0 - камень
    // 1 - ножницы
    // 2 - бумага

    public static void main(String[] args) {

        int valueRandom;
        int myValue;

        boolean contGame = true;

        String answer = " ";

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Камень - 0");
        System.out.println("Ножницы - 1");
        System.out.println("Бумага - 2");

        while (contGame) {

            System.out.print("Введи число от 0 до 2: ");

            while (!(scan.hasNextInt())) {
                System.out.println("Неправильное число, введи новое: ");
                scan.nextLine();
            }
            myValue = scan.nextInt();

            valueRandom = rand.nextInt(2);

            System.out.print("Я загадал число : " + valueRandom + "\n");

            // если будет выигрышный ход с обеих сторон
            if ((myValue == valueRandom)) {
                System.out.println("Ничья! ");
            } else {
                switch (valueRandom) {
                    case 0: // камень 0 и ножницы 1  valueRandom - рандом;  myValue - наше число
                        if (!(valueRandom > myValue)) {
                            System.out.println("Я загадал камень (0), у тебя ножницы (1)");
                            System.out.println("Ты проиграл!");
                            // камень 0 и бумага 2
                        } else if (valueRandom < myValue) {
                            System.out.println("Я загадал камень (0), у тебя бумага (2)");
                            System.out.println("Ты победил!");
                        }
                        break;
                    case 1: // ножницы 1 и камень 0  valueRandom - рандом;  myValue - наше число
                        if (!(valueRandom < myValue)) {
                            System.out.println("Я загадал ножницы (1), у тебя камень (0)");
                            System.out.println("Ты победил!");
                            // ножницы 1 и бумага 2
                        } else if (valueRandom < myValue) {
                            System.out.println("Я загадал ножницы (1), у тебя бумага (2)");
                            System.out.println("Ты проиграл!");
                        }
                        break;
                    case 2: // бумага 2 и камень 0
                        if (valueRandom > myValue) {
                            System.out.println("Я загадал бумагу (2), у тебя камень (0)");
                            System.out.println("Ты проиграл!");
                            // бумага 2 и ножницы 1
                        } else if (!(valueRandom < myValue)) {
                            System.out.println("Я загадал бумагу (2), у тебя ножницы (1)");
                            System.out.println("Ты победил!");
                        }
                }
            }

            System.out.print("Продолжить играть? Введи ответ: ");
            answer = scan.next();
            if(answer.equals("да")){
                continue;
            }else if (answer.equals("нет")){
                contGame = false;
            }
        }
        System.out.println("Спасибо за игру!");
   }
}
