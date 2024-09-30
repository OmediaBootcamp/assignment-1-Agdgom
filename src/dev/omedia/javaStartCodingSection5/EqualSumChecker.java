package dev.omedia.javaStartCodingSection5;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum == thirdNum;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(2, 2, 4));   // true
        System.out.println(hasEqualSum(6, -6, 0));  // true
        System.out.println(hasEqualSum(5, 1, 7));   // false
    }
}
