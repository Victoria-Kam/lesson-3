package com.company.homework.additionalTasks;

/*
 * 1. Выведите на экран первые 11 членов последовательности Фибоначчи.
 * */
public class Task1 {

    public void first() {

        int temp1 = 0;
        int temp2 = 1;
        int summ = 0;

        for (int i = 0; i <= 11; i++) {

            System.out.println(summ);
            summ = temp1 + temp2;
            temp1 = temp2;
            temp2 = summ;
        }
    }
}
