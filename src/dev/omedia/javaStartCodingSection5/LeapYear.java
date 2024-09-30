package dev.omedia.javaStartCodingSection5;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1700)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2400)); // true
        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(2023)); // false
    }
}

