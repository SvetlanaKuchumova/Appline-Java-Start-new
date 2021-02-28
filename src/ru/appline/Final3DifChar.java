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

        int countDif; // количество различных символов
        int maxCountDif = 0; // максимальное количество различных символов
        int iMaxDif = 0; //индекс строки с маскимальным количеством различных символов

        //проходим по каждому слову
        for (int i = 0; i < countStr; i++) {
            //если строка не пустая
            if (!arrStr[i].isEmpty()) {
                countDif = 0;
                char[] wordToChar = arrStr[i].toCharArray(); // Преобразуем строку str в массив символов (char)
                //проверяем первый символ строки
                if (wordToChar[0] != '\u0020') { // проверка на наличие пробела
                    countDif++;
                }
                //проверяем остальные символы строки
                for (int j = 1; j < wordToChar.length; j++) {
                    int k = 0;
                    boolean isCharDif = true; //символы отличаются
                    while ( (j > k) && (isCharDif) ) {
                        if (wordToChar[j] != '\u0020') { // проверка на наличие пробела
                            if (wordToChar[j] == wordToChar[k]){
                                isCharDif = false;
                            }
                        }
                        k++;
                    }
                    if (isCharDif){
                        countDif++;
                    }
                }
                if (countDif > maxCountDif){
                    maxCountDif = countDif;
                    iMaxDif = i;
                }
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
