package com.bridgelabz;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number = ");
        int num2 = scanner.nextInt();

        int swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("*After Swapping*");
        System.out.println("first number = " +num1);
        System.out.println("second number = " +num2);
    }
}
