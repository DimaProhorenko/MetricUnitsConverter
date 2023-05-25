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
            double miles = Converter.convertKmsToMiles(km);
            System.out.printf("%.2fkm is %.2f miles\n", km, miles);
            System.out.printf("%.2fmiles is %.2f km\n", miles, Converter.convertMilesToKms(miles));
            System.out.println();
        }
    }
}
