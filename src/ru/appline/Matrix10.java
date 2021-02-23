package ru.appline;

import java.util.Scanner;

public class Matrix10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ввести размерность матрицы
        System.out.print("Введите размерность матрицы:\nКоличество строк: ");
        int linesCount = scan.nextInt();
        System.out.print("Количество столбцов: ");
        int columnsCount = scan.nextInt();

        double matrix[][] = new double[linesCount][columnsCount];

        //Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for(int i = 0; i < linesCount; i++ )
            for(int j = 0; j < columnsCount; j++ ){
                matrix[i][j] = scan.nextDouble();
            }

        //Вывести матрицу
        System.out.println("Матрица:");
        for(int i = 0; i < linesCount; i++ ){
            for(int j = 0; j < columnsCount; j++ ){
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.print("\n");
        }

        //Вывод первой строки матрицы, умноженной на 3 * 3
        System.out.println("Первая строка матрицы * 3:");
        for(int i = 0; i < columnsCount; i++ ){
            System.out.printf("%.2f   ", matrix[0][i] * 3);
        }

    }
}
