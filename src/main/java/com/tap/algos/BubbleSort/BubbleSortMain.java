package com.tap.algos.BubbleSort;

import com.tap.algos.Utils;

import java.util.Arrays;

public class BubbleSortMain {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                int currValue = arr[j];
                int nextValue = arr[j + 1];

                if (currValue > nextValue) {
                    arr[j] = nextValue;
                    arr[j + 1] = currValue;
                }
            }
        }

        return arr;
    }

    public static String[] sort(String[] arr) {
        return arr;
    }


    public static void main(String[] args) {
        int[] testArr = Utils.generateArray(5);
        System.out.println("Sorted: " + Arrays.toString(BubbleSortMain.sort(testArr)));
    }

}
