package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        // ISO date, has not formatter need (it's the default)

        LocalDate localDate;
        DateTimeFormatter formatter;

        // 1. ISO format (default)
        String isoDate = "2026-10-21";
        localDate = LocalDate.parse(isoDate);
        System.out.println("Converted ISO: " + isoDate + " to localDate: " +  localDate.getMonth());

        // 2. US format
        String usDate = "10/21/2026";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        localDate = LocalDate.parse(usDate, formatter);
        System.out.println("Converted US: " + usDate + " to localDate: " + localDate.getMonth());

        // 3. EURO format
        String euroDate = "21/10/2026";
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        localDate = LocalDate.parse(euroDate, formatter);
        System.out.println("Converted EURO: " + euroDate + " to localDate: " + localDate.getMonth());

    }
}
