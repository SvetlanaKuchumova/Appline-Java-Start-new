package ru.appline;

import java.util.Scanner;

public class LatinWords13 {
    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);

        //Введенная строка str
        String str = scan.nextLine();

        //Разобьем строку str на массив слов arrWords
        String[] arrWords = str.split(" ");

        //Количество латинских слов
        int counterLatinWords = 0;

        for (int i = 0; i < arrWords.length; i++) {
            char[] wordToChar = arrWords[i].toCharArray(); // Преобразуем строку str в массив символов (char)
            int j = 0;
            boolean isLatinChar = true;
            while ((j < wordToChar.length) && (isLatinChar == true)) {
                if (((wordToChar[j] >= 'a') && (wordToChar[j] <= 'z')) || ((wordToChar[j] >= 'A') && (wordToChar[j] <= 'Z'))) { // принадлежит латинице
                    j++;
                } else {
                    isLatinChar = false;
                }
            }
            if (isLatinChar == true) {
                counterLatinWords++;
                System.out.println(arrWords[i]); // Выводим слова, состоящие из латиницы
            }
        }
        System.out.println("Количество слов, состоящих из латиницы: " + counterLatinWords);

    }
}
