package com.pluralsight;

import java.util.regex.Pattern;

public class INeedArrays {
    public static void main(String[] args) {

        String student1 = "Tai";
        String student2 = "Samin";
        String student3 = "Yahir";

        //csv = comma separate value
        String studentCsv = "Tai, Samin, Yahir";

        String[]  students = studentCsv.split("\\,");
        System.out.println("");
    }

}
