import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TripCostCalculator tripCostCalculator = new TripCostCalculator();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the distance in km: ");
            double distance = scanner.nextDouble();
            tripCostCalculator.setDistance(distance);
            System.out.println("Enter the fuel price: ");
            double fuelPrice = scanner.nextDouble();
            tripCostCalculator.setFuelPrice(fuelPrice);
            System.out.println(tripCostCalculator.display());
            System.out.println("Do you want to calculate another trip cost? (yes/no)");
            String answer = scanner.next();
            if (answer.equals("no")) {
                break;
            }
        }
    }
}
