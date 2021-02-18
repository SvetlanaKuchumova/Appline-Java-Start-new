package ru.appline;

public class ArrayTask3 {
    public static void main(String[] args) {
        int[] intNumbers = {4490, -1, 15, 0,-695}; // массив целых чисел

        //меняем местами первый и последний элемент в массиве
        int temp = intNumbers[0]; //сохраняем первый элемент массива
        intNumbers[0] = intNumbers[intNumbers.length-1]; // последний элемент массива копируем в первый
        intNumbers[intNumbers.length-1] = temp; // первый элемент копируем в последний

        //Вывести измененный массив
        for (int i = 0; i < intNumbers.length;  i++){
            System.out.print(intNumbers[i]+ " ");
        }

        System.out.println("\nСумма первого и среднего элемента массива:");
        System.out.println(intNumbers[0] + intNumbers[intNumbers.length/2]);
    }
}
