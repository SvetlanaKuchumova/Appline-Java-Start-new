package ru.appline;

import java.util.Scanner;

public class SumOddNumbers8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int number = scan.nextInt();

        int i = 1;
        int sum = 0; // сумма нечетных чисел

        while (i <= number){
            if (i % 2 != 0){ // нечетное число
                sum = sum + i;
            }
            i += 2;
        }

        System.out.println("Сумма нечетных чисел от 0 до " + number + " = " + sum);

    }
}
