package Invoice;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare=distance*MINIMUM_COST_PER_KM+time*COST_PER_TIME;
        return totalFare < MINIMUM_FARE ? MINIMUM_FARE : totalFare;
    }

}
