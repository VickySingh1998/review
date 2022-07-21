package com.bridgelabz;

import javax.naming.PartialResultException;

public class SmallestElement {
    public static void main(String[] args) {
        int number[] = {45, 22, 32, 10, 23, 43, 78};

        int small = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] < small)
                small = number[i];
        }
        System.out.println("Smallest element present is = " + small);
    }
}
