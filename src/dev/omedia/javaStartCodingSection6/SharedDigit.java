package dev.omedia.javaStartCodingSection6;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int num1FirstDigit = num1 / 10;
        int num1SecondDigit = num1 % 10;

        int num2FirstDigit = num2 / 10;
        int num2SecondDigit = num2 % 10;

        return (num1FirstDigit == num2FirstDigit || num1FirstDigit == num2SecondDigit ||
                num1SecondDigit == num2FirstDigit || num1SecondDigit == num2SecondDigit);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99));  // false
        System.out.println(hasSharedDigit(15, 55)); // true
        System.out.println(hasSharedDigit(12, 34)); // false
        System.out.println(hasSharedDigit(21, 31)); // true
    }
}
