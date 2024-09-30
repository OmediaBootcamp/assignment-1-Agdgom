package dev.omedia.javaStartCodingSection6;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));  // 31 (January)
        System.out.println(getDaysInMonth(2, 2020));  // 29 (February, Leap Year)
        System.out.println(getDaysInMonth(2, 2017));  // 28 (February, Not a Leap Year)
        System.out.println(getDaysInMonth(4, 2020));  // 30 (April)
        System.out.println(getDaysInMonth(13, 2020)); // -1 (Invalid month)
    }
}
