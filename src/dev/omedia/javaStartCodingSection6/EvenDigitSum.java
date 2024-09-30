package dev.omedia.javaStartCodingSection6;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456)); // 12
        System.out.println(getEvenDigitSum(2468));   // 20
        System.out.println(getEvenDigitSum(13579));  // 0
        System.out.println(getEvenDigitSum(-123));   // -1
    }
}
