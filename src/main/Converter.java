package main;

public abstract class Converter {
    public static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }

    public static double convertKmsToMiles(double kms) {
        return kms / 1.60934;
    }
}
