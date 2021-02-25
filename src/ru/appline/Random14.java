package ru.appline;

import java.util.Random;

public class Random14 {
    public static void main(String[] args) {

        Random random = new Random();

        //Массив рандомных элементов
        double[] arrRandom = new double[15];

        //Минимальное и максимальное значение рандомных чисел [-20 ; 20]
        final int MAX_RANGE = 20;
        final int MIN_RANGE = -20;

        System.out.println("Массив: ");
        //Заполнение массива рандомными числами
        for (int i = 0; i < 15; i++) {
            arrRandom[i] = MIN_RANGE + Math.random() * ( MAX_RANGE - MIN_RANGE );//random.nextDouble();
            System.out.printf("%.3f \n", arrRandom[i]);
        }

        //Поиск максимального элемента
        double maxEl = arrRandom[0];
        for (int i = 1; i < arrRandom.length; i++){
            if (arrRandom[i] > maxEl){
                maxEl = arrRandom[i];
            }
        }
        System.out.printf("max = %.3f \n", maxEl);

        //Поиск минимального элемента
        double minEl = arrRandom[0];
        for (int i = 0; i < arrRandom.length; i++){
            if (arrRandom[i] < minEl){
                minEl = arrRandom[i];
            }
        }
        System.out.printf("min =  %.3f \n", minEl);

        // Вычисление наибольшего значения по модулю между minEl и maxEl
        if ( Math.abs(maxEl) >= Math.abs(minEl) ){
            System.out.printf("Наибольшее значение по модулю из min и max = %.3f \n", Math.abs(maxEl));
        } else {
            System.out.printf("Наибольшее значение по модулю из min и max = %.3f \n ", Math.abs(minEl));
        }
    }
}
