package ru.appline;

import java.util.Scanner;

public class Final1Converter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Данный конвертер переводит рубли в доллары");

        System.out.print("Введите текущий курс доллара (1 доллар): ");
        double courseDollar = scan.nextDouble();; // курс доллара

        System.out.print("Введите количество рублей: ");
        double countRub = scan.nextDouble(); //количество рублей

        if ( (courseDollar > 0 ) && (countRub >= 0)){
            double dollars = countRub / courseDollar; //количество долларов
            System.out.printf("Итого: %.2f долларов \n", dollars);
        }
        else {
            System.out.println("Некорректный ввод");
        }
    }
}
