package com.pluralsight;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

//        String formattedNumber = String.format("%.2f", 3.14145);
//        System.out.println(formattedNumber);

        String name = "Yahir"; //we want: YAHIR
        System.out.println("Original String: " + name);

        name = name.trim();
        name =  name.toUpperCase();

        if (name.startsWith("YA")){
            System.out.println("starts with YA");
        }

        System.out.println("modified string: " + name);
    }
}
