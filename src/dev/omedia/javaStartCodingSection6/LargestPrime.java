package dev.omedia.javaStartCodingSection6;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));    // 7
        System.out.println(getLargestPrime(217));   // 31
        System.out.println(getLargestPrime(0));     // -1
        System.out.println(getLargestPrime(45));    // 5
        System.out.println(getLargestPrime(-1));    // -1
    }
}
