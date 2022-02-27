package com.company.homework.сontrolStructures;

/*
*   По введенному номеру определить цвет радуги (1 –
    красный, 4 – зеленый и т. д.).
* */

import java.util.Scanner;

public class Task5 {

    public void fifth(){

        int color = 0;
        boolean correctImput = false;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введи номер цвета радуги: ");

        while(!correctImput){
            while (!scan.hasNextInt()){
                System.out.println("Нужно целое число от 1 до 7! Попробуй еще раз!");
                scan.nextLine();
            }
            color = scan.nextInt();

            if(color <= 0 || color >= 8){
                System.out.println("Нужно  число от 1 до 7! Попробуй еще раз!");
            }else{
                correctImput = true;
            }
        }
        switch (color){
            case 1:
                System.out.println("В радуге это красный цвет!");
                break;
            case 2:
                System.out.println("В радуге это оранжевый цвет!");
                break;
            case 3:
                System.out.println("В радуге это желтый цвет!");
                break;
            case 4:
                System.out.println("В радуге это зеленый цвет!");
                break;
            case 5:
                System.out.println("В радуге это голубой цвет!");
                break;
            case 6:
                System.out.println("В радуге это синий цвет!");
                break;
            case 7:
                System.out.println("В радуге это фиолетовый цвет!");
                break;

        }

    }
}
