package com.company.homework.cycles;

/*
* 4. Необходимо, чтоб программа выводила на экран вот такую
     последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
     В решении используйте цикл while.
* */

public class Task4 {

    public static void fourth() {

        int x = 7;
        int summ = 0;

        while ((summ + 7) < 100)  {
            summ +=7;
            System.out.print(summ + " ");
        }
    }
}
