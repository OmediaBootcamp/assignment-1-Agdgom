package dev.omedia.javaStartCodingSection5;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megabytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes % 1024;

        System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, megabytes, remainingKilobytes);
    }
}
