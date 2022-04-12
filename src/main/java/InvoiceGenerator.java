public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 5;
    private static final double MINIMUM_FARE = 5.0;
    private static final double MINIMUM_COST_PER_KILOMETER_NORMAL = 5;
    private static final double COST_PER_TIME_NORMAL = 1;
    private static final double MINIMUM_FARE_NORMAL = 5.0;
    private static final double MINIMUM_COST_PER_KILOMETER_PREMIUM = 15;
    private static final double COST_PER_TIME_PREMIUM = 2;
    private static final double MINIMUM_FARE_PREMIUM = 20.0;

    //calculating fare for a ride
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }
}

