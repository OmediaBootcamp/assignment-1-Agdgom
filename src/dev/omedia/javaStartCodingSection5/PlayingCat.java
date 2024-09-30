package dev.omedia.javaStartCodingSection5;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;

        return temperature >= 25 && temperature <= upperLimit;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 30));  // true
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(true, 46));  // false
        System.out.println(isCatPlaying(false, 28)); // true
    }
}
