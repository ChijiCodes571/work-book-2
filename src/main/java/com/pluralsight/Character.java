package com.pluralsight;

public class Character {
    public static void main(String[] args) {

//        String trackingCode = "USA";
//        char hasShipped = trackingCode.charAt(2);
//        System.out.println(trackingCode.length());
//
//        System.out.println(hasShipped);

        String startString  = "Nates brain melt";

        String name = startString.substring(0, 4);
        System.out.println(name);

        String brainMelt = startString.substring(7);
        System.out.println(brainMelt);
    }
}
