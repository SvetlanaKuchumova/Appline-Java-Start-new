package ru.appline;

import java.util.Scanner;

public class Final3DifChar {
    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner scan = new Scanner(System.in);

        // количество строк
        int countStr = scan.nextInt();

        // Массив строк
        String[] arrStr = new String[countStr];
        arrStr[0] = scan.nextLine(); // записать перенос строки, чтобы в первый элемент массива не записалось ""

        System.out.println("Введите строки: ");
        for (int i = 0; i < countStr; i++){
            arrStr[i] = scan.nextLine();
        }

        int countDif = 0; // количество различных символов
        int maxCountDif = 0; // максимальное количество различных символов
        int iMaxDif = 0; //индекс строки с маскимальным количеством различных символов

        //проходим по каждому слову
        for (int i = 0; i < countStr; i++) {
            //если строка не пустая
            if (!arrStr[i].isEmpty()) {
                countDif = 1;
                boolean isSameChar;
                char[] wordToChar = arrStr[i].toCharArray(); // Преобразуем строку str в массив символов (char)
                char[] diffChar = new char[wordToChar.length]; // Массив, состоящий только из различных символов
                //проверяем символы строки
                diffChar[0] = wordToChar[0];
                for (int j = 1; j < wordToChar.length; j++) {
                    isSameChar = false;
                    int k = 0;
                    while ((k < countDif) && (isSameChar == false)) {
                        if (wordToChar[j] != diffChar[k]) {
                            k++;
                        } else {
                            isSameChar = true;
                        }
                    }
                    if (isSameChar == false) {
                        countDif++;
                        diffChar[countDif - 1] = wordToChar[j];
                    }
                }
            }
            if (countDif > maxCountDif) {
                maxCountDif = countDif;
                iMaxDif = i;
            }
        }

        if (maxCountDif != 0){
           System.out.print("Строка с максимальным количеством различных символов: " + arrStr[iMaxDif]);
        }
        else {
            System.out.print("Строки пустые");
        }
    }
}
