package main;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main.Merge Conflict");
        Random rand = new Random();
        testConverter(rand);

    }

    private static void testConverter(Random rand) {
        for(int i = 0; i < 10; i++) {
            double km = rand.nextDouble(15);
            System.out.printf("%.2fkm is %.2f miles\n", km, Converter.convertKmsToMiles(km));
        }
        System.out.println();
        for(int i = 0; i < 10; i++) {
            double miles = rand.nextDouble(15);
            System.out.printf("%.2f miles is %.2fkm\n", miles, Converter.convertMilesToKms(miles));
        }
    }
}
