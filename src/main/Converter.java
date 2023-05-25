package main;

public abstract class Converter {
    public static double convertMilesToKms(double miles) {
        return miles * Constants.KM_MILES_MULTIPLIER;
    }

    public static double convertKmsToMiles(double kms) {
        return kms / Constants.KM_MILES_MULTIPLIER;
    }
}
