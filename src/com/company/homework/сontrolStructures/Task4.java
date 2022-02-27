package com.company.homework.сontrolStructures;

/*
* 4. Для введенного числа t (температура на улице) вывести
    Если t>–5, то вывести «Тепло».
    Если –5>= t > –20, то вывести «Нормально».
    Если –20>= t, то вывести «Холодно».
* */

import java.util.Scanner;

public class Task4 {

    public static void fourth(){

        int temterature;
        boolean stopCount = false;
        String answer = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Введи число:");

        temterature = scan.nextInt();

        if(temterature > -5){
            System.out.println("На улице тепло!");
        }else if ( temterature <= -5 && temterature > -20){
            System.out.println("На улице нормально!");
        }else if(temterature <= -20){
            System.out.println("На улице холодно!");
        }
    }
}
