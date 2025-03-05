public class TripCostCalculator {
    private final double fuelConsumptionRate;
    private double distance;
    private double fuelPrice;


    public TripCostCalculator() {
        this.fuelConsumptionRate = 5.0 / 100.0;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double fuelNeededToTravel() {
        return distance * fuelConsumptionRate;
    }

    public double calculateTripCost() {
        return fuelNeededToTravel() * fuelPrice;
    }

    public String display() {
        return "The cost of the trip is: " + calculateTripCost();
    }
}
