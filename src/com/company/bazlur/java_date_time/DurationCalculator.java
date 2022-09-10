package com.company.bazlur.java_date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DurationCalculator {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter start date(MM/dd/yyyy): ");
            String first = input.nextLine();
            LocalDate startDate = LocalDate.parse(first, formatter);

            System.out.println("Enter end date(MM/dd/yyyy): ");
            String second = input.nextLine();
            LocalDate endDate = LocalDate.parse(second, formatter);

            Period period = Period.between(startDate, endDate);

            System.out.println("It is " + period.getYears() + " years, "
                    + period.getMonths() + " months and " + period.getDays() + " days.");
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            System.out.println("Invalid Date, " + "please use proper format");
        }
    }
}