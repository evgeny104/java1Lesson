package com.greekbrains.lesson2;

public class Homework2 {

    public static void main(String[] args) {
        boolean a = sumAB(-10, 20);
            System.out.println("Результат " + a);
    }
    private static boolean sumAB(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return false;
        } else {
            return true;
        }
    }

}