package ru.appline;

import java.util.Scanner;

public class Calculator5 {
    public static void main(String[] args) {
        System.out.print("Введите 2 числа: ");
        Scanner scan = new Scanner(System.in);

        //Ввод чисел num1, num2
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        //Ввод операции + - / *
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’");
        char ch = scan.next().charAt(0);

        double result = 0;

        //Калькулятор
        switch (ch){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Введенный символ не равен + - * или /");
        }

        //Вывод результата
        if ( (ch == '+') || (ch == '-') || (ch == '*') || (ch == '/') ){
            System.out.println(num1 + " " + ch + " " + num2 + " = " + result);
        }
        else {
            System.out.println("Выполнить операцию невозможно");
        }
    }
}
