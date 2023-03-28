package com.greekbrains.lesson3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        numbers();
        longArray();
        multiTwo();
        int[][] array = new int[4][4];
        int lastIndex = array.length - 1;
        fillDiagonal(array, lastIndex);
        initArray(1, 2);
        System.out.println(Arrays.toString(initArray(5, 6)));
    }

    public static void numbers() {
        int[] arrData = {1, 1, 0, 0, 1, 1, 0, 0,};
        for (int i = 0; i < arrData.length; i++) {
            if (arrData[i] == 1) {
                arrData[i] = 0;
            } else if (arrData[i] == 0)
                arrData[i] = 1;
        }
        System.out.println(Arrays.toString(arrData));
    }

    public static void longArray() {
        int[] arrData = new int[100];
        for (int i = 0; i < arrData.length; i++) {
            arrData[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrData));
    }

    public static void multiTwo() {
        int[] arrData = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrData.length; i++) {
            int a = 6;
            if (arrData[i] <= a) {
                arrData[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrData));
    }

    private static void fillDiagonal(int[][] array, int lastIndex) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = array[i][lastIndex - i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static int[] initArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}