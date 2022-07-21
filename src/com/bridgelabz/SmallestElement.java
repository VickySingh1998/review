package com.bridgelabz;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the numbers :- ");

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0];

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + min);
    }
}
