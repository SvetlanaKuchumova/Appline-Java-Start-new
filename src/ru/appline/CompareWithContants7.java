package ru.appline;

import java.util.Scanner;

public class CompareWithContants7 {
    public static void main(String[] args) {

        //Константы
        final double CONST_X = -15;
        final double CONST_Y = 11.0099;
        final double CONST_Z = 1200;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int number = scan.nextInt(); // number - количество элементов в массиве

        double arrayNumbers[] = new double[number]; // массив чисел
        int i;

        System.out.println("Введите элементы массива:");
        for (i = 0; i < number; i++) {
            arrayNumbers[i] = scan.nextDouble();
        }

        boolean isConst = false;

        i = 0;
        while ((isConst == false) && (i < number)) {
            if ((arrayNumbers[i] == CONST_X) || (arrayNumbers[i] == CONST_Y) || (arrayNumbers[i] == CONST_Z)) {
                isConst = true;
            } else {
                i++;
            }
        }

        if (isConst == true) {
            System.out.print("Данное значение имеется в константах");
        }

    }
}


