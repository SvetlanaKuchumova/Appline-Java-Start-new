package ru.appline;

import java.util.Scanner;

public class ArrayMultAverage9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int number = scan.nextInt(); // number - количество элементов в массиве

        double arrayNumbers[] = new double[number]; // массив чисел

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < number; i++) {
            arrayNumbers[i] = scan.nextDouble();
        }

        double sum = 0; //Сумма элементов массива
        double avg = 0; //Среднее арифметическое массива

        //Считаем сумму элементов массива
        for (int i = 0; i < number; i++) {
            sum = sum + arrayNumbers[i];
        }
        //Считаем среднее арифметическое массива
        avg = sum / number;

        System.out.println("Среднее арифметическое = " + avg);

        System.out.printf("Массив, умноженный на %.4f : \n",avg);
        for (double nums: arrayNumbers) {
            System.out.printf("%.4f \n", nums * avg);
            
        }

    }
}
