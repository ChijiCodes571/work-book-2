package com.pluralsight.oop;

import java.lang.instrument.Instrumentation;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person pRetty = new Person("Alexis", 23);

        Person instructor;
        instructor = new Person( "Pluralsight Instructor", 99);

        Person[] peeps = new Person[2]; //creates a new array
        System.out.println("here's the length of the array of person objects: " + peeps.length);
        System.out.println("here's the length of the Person OBJECT: " + pRetty.lenght);
        peeps[0] = pRetty;
        peeps[1] = instructor;
        System.out.println("Hi " + pRetty.name + " you are " + pRetty.age + " years young");

        Car[] cars = new Car[5];

    }



}
