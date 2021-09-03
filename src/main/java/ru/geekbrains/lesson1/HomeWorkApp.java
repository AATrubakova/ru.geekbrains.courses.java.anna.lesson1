package ru.geekbrains.lesson1;

import java.util.Scanner;

public class HomeWorkApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("2. Метод printThreeWords() печатает в столбец три слова: Orange, Banana, Apple.");
        printThreeWords();
        System.out.println("3. Метод checkSumSign() определяет значение суммы двух целых чисел.");
        checkSumSign();
        System.out.println("4. Метод  printColor() возвращает сообщение на определение значения переменной value.");
        printColor();
        System.out.println("5. Метод compareNumbers().");
        compareNumbers();
        scanner.close();
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign() {
        System.out.println("Введите целое число a:");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b:");
        int b = scanner.nextInt();
        int result = a + b;
        if (b < 0) System.out.println("Результат суммы " + a + "+(" + b + ")=" + result);
        else System.out.println("Результат суммы " + a + "+" + b + "=" + result);
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }
    public static void printColor() {
        System.out.println("Введите значение переменной value:");
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        } else if(value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        System.out.println("Введите целое число a:");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b:");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println(a + ">=" + b);
        } else if (a < b) {
            System.out.println(a + "<" + b);
        }
    }
}
