package com.greekbrains.lesson2;

public class Homework2 {

    public static void main(String[] args) {
        boolean a = sumAB(-10, 20);
            System.out.println("Результат " + a);
        isPositiveOrNegative(-1);
        boolean b = isNegative(-1);
            System.out.println(b);
        printWordTimes("Hello World", 5);
    }
    private static boolean sumAB(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return false;
        } else {
            return true;
        }
    }
    public static void isPositiveOrNegative (int a ) {
        if ( a >= 0 ) {
            System.out.println("Число положительное " + a);
        } else {
            System.out.println("Число отрицательное " + a);
        }
    }
    public static boolean isNegative (int a ) {
        return a < 0;
    }
    public static void printWordTimes (String Word, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(Word);
        }
    }
}