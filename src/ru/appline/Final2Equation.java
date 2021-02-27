package ru.appline;

import java.util.Scanner;

public class Final2Equation {
    public static void main(String[] args) {
        System.out.print("Введите уравнение: ");
        Scanner scan = new Scanner(System.in);

        //Введенная строка с уравнением strEq
        String strEq = scan.nextLine();

        //Разобьем строку strEq на массив символов
        char[] equation = strEq.toCharArray();

        int x = 0;

        //проверяем наличие = и знака + или -
        if ((equation.length == 5) && ((equation[1] == '+') || (equation[1] == '-')) && (equation[3] == '=')) {
            //рассматрим вариант, когда х стоит на первом месте, а на 2 и 3 - цифры
            if ((equation[0] == 'x') && (Character.isDigit((equation[2]))) && (Character.isDigit((equation[4])))) {
                if (equation[1] == '+') { // x+5=7
                    x = Character.getNumericValue(equation[4]) - Character.getNumericValue(equation[2]);
                    System.out.print("x = " + x);
                } else { // x-5=7
                    x = Character.getNumericValue(equation[4]) + Character.getNumericValue(equation[2]);
                    System.out.print("x = " + x);
                }
            }
            //рассматрим вариант, когда х стоит на 2м месте, а на 1 и 3 - цифры
            else if ((equation[2] == 'x') && (Character.isDigit((equation[0]))) && (Character.isDigit((equation[4])))) {
                if (equation[1] == '+') { // 3+x=9
                    x = Character.getNumericValue(equation[4]) - Character.getNumericValue(equation[0]);
                    System.out.print("x = " + x);
                } else { // 3-x=9
                    x = Character.getNumericValue(equation[0]) - Character.getNumericValue(equation[4]);
                    System.out.print("x = " + x);
                }
            }
            //рассматрим вариант, когда х стоит на 3м месте, а на 1 и 2 - цифры
            else if ((equation[4] == 'x') && (Character.isDigit((equation[0]))) && (Character.isDigit((equation[2])))) {
                if (equation[1] == '+') { // 3+3=x
                    x = Character.getNumericValue(equation[0]) + Character.getNumericValue(equation[2]);
                    System.out.print("x = " + x);
                } else { // 3-4=x
                    x = Character.getNumericValue(equation[0]) - Character.getNumericValue(equation[2]);
                    System.out.print("x = " + x);
                }
            } else {
                System.out.print("Уравнение не корректно");
            }
        }
        else {
            System.out.print("Уравнение не корректно");
        }
    }
}
