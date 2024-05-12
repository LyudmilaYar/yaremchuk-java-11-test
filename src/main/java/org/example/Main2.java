package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String a = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String b = scanner.nextLine();
        System.out.println(a.equals(b) ? "Строки идеинтичны" : "Строки неидеинтичны"); // Проверить деление
    }
}