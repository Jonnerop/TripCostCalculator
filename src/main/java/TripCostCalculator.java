import java.util.Scanner;

public class TripCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance to travel (in km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();

        double totalCost = calculateTripCost(distance, fuelPrice);

        System.out.printf("Total cost of the trip: %.2f%n", totalCost);

        scanner.close();
    }
    public static double calculateTripCost(double distance, double fuelPrice) {
        double fuelConsumptionRate = 5.0 / 100.0;
        double totalFuelNeeded = distance * fuelConsumptionRate;
        return totalFuelNeeded * fuelPrice;
    }
}
