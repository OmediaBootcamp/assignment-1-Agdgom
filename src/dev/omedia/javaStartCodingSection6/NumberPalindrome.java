package dev.omedia.javaStartCodingSection6;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        number = Math.abs(number);

        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse == Math.abs(originalNumber);
    }

    public static void main(String[] args) {
        // Примеры вызова метода
        System.out.println(isPalindrome(-1221));  // true
        System.out.println(isPalindrome(707));    // true
        System.out.println(isPalindrome(11212));  // false
    }
}
