package com.company.homework.cycles;

/*
* 5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
* */
public class Task5 {

    public void fifth(){
        for(int i = 0, j = 0; i < 10; i++, j-=5){
            System.out.print(j + " ");
        }
    }
}
