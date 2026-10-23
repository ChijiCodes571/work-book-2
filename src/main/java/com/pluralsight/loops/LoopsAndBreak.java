package com.pluralsight.loops;

public class LoopsAndBreak {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            sum += 1;
        }
        System.out.println("Sum = " + sum);
    }
}
