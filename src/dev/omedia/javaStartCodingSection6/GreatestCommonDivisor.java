package dev.omedia.javaStartCodingSection6;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int min = Math.min(first, second);
        int result = 1;

        for (int i = min; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); // 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // 6
        System.out.println(getGreatestCommonDivisor(9, 18));  // -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // 9
    }
}
