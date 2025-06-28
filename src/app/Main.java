package app;

public class Main {

    private static final double CONV_K = 2.20462;
    private static final double CONV_MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 2.0.");

        double kgs = 5;
        double pnds = 12;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Weight conversion: " + pounds + " pounds and " + kilos + " kgs.");

        double miles = 3;
        double kilometers = 7;
        double milesToKm = convMilesToKm(miles);
        double kmToMiles = convKmToMiles(kilometers);
        System.out.println("Distance conversion: " + miles + " miles = " + milesToKm + " km, "
                + kilometers + " km = " + kmToMiles + " miles.");
    }

    private static double convKgsToPounds(double kgs){
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pnds){
        return pnds / CONV_K;
    }

    private static double convMilesToKm(double miles){
        return miles * CONV_MILES_TO_KM;
    }

    private static double convKmToMiles(double km){
        return km / CONV_MILES_TO_KM;
    }
}