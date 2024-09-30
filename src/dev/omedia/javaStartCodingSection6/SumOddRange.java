package dev.omedia.javaStartCodingSection6;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0) {
            return -1;
        }
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));   // 2500
        System.out.println(sumOdd(-1, 100));  // -1
        System.out.println(sumOdd(100, 100)); // 0
        System.out.println(sumOdd(13, 13));   // 13
        System.out.println(sumOdd(100, -100)); // -1
        System.out.println(sumOdd(100, 1000)); // 247500
    }
}
