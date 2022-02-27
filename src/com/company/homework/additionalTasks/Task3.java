package com.company.homework.additionalTasks;

/*
 * 3. Напишите программу, которая выводит на консоль таблицу умножения.
 * */
public class Task3 {
    public static void third() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + " \t");
                if(i !=10){
                    System.out.print("\t");
                }else{
                    continue;
                }
            }
            System.out.print("\n");
        }
    }
}
