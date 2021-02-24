package ru.appline;

import java.util.Scanner;

public class CompareNumbers10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String str1 = scan.nextLine();

        System.out.print("Введите второе число: ");
        int number2 = scan.nextInt();


        if (Integer.valueOf(str1) > number2){
            System.out.println("Большее число: " + Integer.valueOf(str1));
            double d_min = (double) number2;
            System.out.println("Меньшее число: " + d_min);
        }
        else if (Integer.valueOf(str1) < number2){
            System.out.println("Большее число: " + number2);
            double d_min = (double) Integer.valueOf(str1);
            System.out.println("Меньшее число: " + d_min);
        }
        else {
            System.out.println("Числа равны");
        }
    }
}
