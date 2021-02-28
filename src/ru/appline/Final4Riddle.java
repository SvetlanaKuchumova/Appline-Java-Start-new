package ru.appline;

import java.util.Scanner;

public class Final4Riddle {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает ");
        System.out.println("Ваш ответ: ");
        Scanner scan = new Scanner(System.in);

        // Чтение ответа пользователя
        String answer = scan.nextLine();

        String rigthAnswer = "Заархивированный вирус";
        String giveHint = "Подсказка"; // дайте подсказку
        String hint = "Подсказка: это не лук"; // текст подсказки
        String thinkAgain = "Подумай еще";
        String hintLocked = "Подсказка уже недоступна";
        String youAreRight = "Правильно!";
        String youAreWrong = "Обидно, приходи в другой раз";

        if (answer.compareToIgnoreCase(rigthAnswer) == 0){
            System.out.println(youAreRight);
        }
        else if (answer.compareToIgnoreCase(giveHint) == 0){
            System.out.println(hint);
            System.out.println("Ваш ответ: ");
            answer = scan.nextLine();
            System.out.println((answer.compareToIgnoreCase(rigthAnswer) == 0) ? youAreRight : youAreWrong);
        }
        else {
            System.out.println(thinkAgain);
            System.out.println("Ваш ответ: ");
            answer = scan.nextLine();
            while (answer.compareToIgnoreCase(giveHint) == 0){
                System.out.println(hintLocked);
                answer = scan.nextLine();
            }
            if (answer.compareToIgnoreCase(rigthAnswer) == 0){
                System.out.println(youAreRight);
            }
            else {
                System.out.println(thinkAgain);
                System.out.println("Ваш ответ: ");
                answer = scan.nextLine();
                while (answer.compareToIgnoreCase(giveHint) == 0){
                    System.out.println(hintLocked);
                    answer = scan.nextLine();
                }
                System.out.println((answer.compareToIgnoreCase(rigthAnswer) == 0) ? youAreRight : youAreWrong);
            }
        }
    }
}
