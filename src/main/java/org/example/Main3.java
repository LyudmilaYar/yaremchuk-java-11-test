package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < 10; i++) {
//            array[i] = i + 1;
//        }
        for (int item: array) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        }
    }
}