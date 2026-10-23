package com.pluralsight.loops;

public class Loops {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 3) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);

        i = 1;
        sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 3);
        System.out.println("Sum = " + sum);

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
