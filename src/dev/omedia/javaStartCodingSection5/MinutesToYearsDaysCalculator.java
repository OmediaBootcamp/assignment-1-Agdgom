package dev.omedia.javaStartCodingSection5;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long minutesInDay = 24 * 60;

            long minutesInYear = 365 * minutesInDay;


            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = remainingMinutes / minutesInDay;


            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);  // 525600 min = 1 y and 0 d
        printYearsAndDays(1051200); // 1051200 min = 2 y and 0 d
        printYearsAndDays(561600);  // 561600 min = 1 y and 25 d
        printYearsAndDays(-1);      // Invalid Value
    }
}
