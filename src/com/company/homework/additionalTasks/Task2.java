package com.company.homework.additionalTasks;

import java.util.Scanner;

/*
* 2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
     Напишите программу, в которую пользователь вводит сумму вклада и
     количество месяцев. А банк вычисляет конечную сумму вклада с учетом
     начисления процентов за каждый месяц.
     Для вычисления суммы с учетом процентов используйте цикл for. Пусть
     сумма вклада будет представлять тип float.
*
* */
public class Task2 {

    public void second() {
        float clientSumm = 0;
        float deposit = 0;
        final int precent = 7;
        int month = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        clientSumm = scan.nextFloat();

        System.out.print("Введите количество месяцев, на сволько Вы хотите внести вклад: ");
        while (!scan.hasNextInt()) {
            System.out.println("Ошибка ввода! Введите пожалуйста количество мечяцев. Число должно быть целым.");
            scan.next();
        }
        month = scan.nextInt();
        deposit = (clientSumm * precent) / 100;

        for (int i = 0; i < month; i++) {
            clientSumm += deposit;
        }

        System.out.println("Итоговый вклад составит: " + clientSumm);

    }
}
