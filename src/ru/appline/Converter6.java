package ru.appline;

import java.util.Scanner;

public class Converter6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Выберите, что переводить: 1 - масса, 2 - расстояние ");
        byte physicalValue = scan.nextByte(); // физическая величина
        byte unit; // единица измерения
        double count; //количество единиц измерения

        // Перевод массы
        if (physicalValue == 1){
            System.out.print("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция ");
            unit = scan.nextByte();
            System.out.print("Введите количество: ");
            count = scan.nextDouble();

            double kilos = 0; // килограмм
            double pounds = 0; //фунты
            double ounce = 0; // унции

            switch (unit){
                case 1:
                    kilos = count;
                    pounds = 2.20462 * count;
                    ounce = 35.274 * count;
                     break;
                case 2:
                    pounds = count;
                    kilos = 0.453592 * count;
                    ounce = 16 * count;
                    break;
                case 3:
                    ounce = count;
                    kilos = count / 35.274;
                    pounds = 0.0625 * count;
                    break;
                default:
                    System.out.println("Введено некорректное значение");
                    break;
            }

            System.out.println("Результат:");
            System.out.printf("Килограммы: %.3f\n", kilos);
            System.out.printf("Фунты: %.3f\n", pounds);
            System.out.printf("Унции: %.3f\n", ounce);
        }
        //Перевод расстояния
        else if (physicalValue == 2){
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
            unit = scan.nextByte();
            System.out.print("Введите количество: ");
            count = scan.nextDouble();

            double meters = 0;
            double miles = 0;
            double yards = 0;
            double feet = 0;

            switch (unit){
                case 1:
                    meters = count;
                    miles = count / 1609;
                    yards = 1.094 * count;
                    feet = 3.281 * count;
                    break;
                case 2:
                    miles = count;
                    meters = 1609 * count;
                    yards = 1760 * count;
                    feet = 5280 * count;
                    break;
                case 3:
                    yards = count;
                    meters = count / 1.094;
                    miles = count / 1760;
                    feet = 3 * count;
                    break;
                case 4:
                    feet = count;
                    meters = count / 3.281;
                    miles = count / 5280;
                    yards = count / 3;
                    break;
                default:
                    System.out.println("Введено некорректное значение");
                    break;
            }

            System.out.println("Результат:");
            System.out.printf("Метры: %.3f\n", meters);
            System.out.printf("Мили: %.3f\n", miles);
            System.out.printf("Ярды: %.3f\n", yards);
            System.out.printf("Футы: %.3f\n", feet);
        }
        else {
            System.out.println("Введено некорректное значение");
        }
    }
}
