import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class TripCostCalculatorTest {
    private TripCostCalculator tripCostCalculator;

    @BeforeEach
    public void setUp() {
        tripCostCalculator = new TripCostCalculator();
    }

    @Test
    public void testCalculateTripCost() {
        tripCostCalculator.setDistance(100);
        tripCostCalculator.setFuelPrice(1.5);
        assertEquals(7.5, tripCostCalculator.calculateTripCost());
    }

    @Test
    public void testCalculateTripCostZeroDistance() {
        tripCostCalculator.setDistance(0);
        tripCostCalculator.setFuelPrice(1.5);
        assertEquals(0, tripCostCalculator.calculateTripCost());
    }

    @Test
    public void fuelNeededToTravel100Km() {
        tripCostCalculator.setDistance(100);
        tripCostCalculator.setFuelPrice(1.5);
        assertEquals(5, tripCostCalculator.fuelNeededToTravel());
    }

    @Test
    public void display() {
        tripCostCalculator.setDistance(100);
        tripCostCalculator.setFuelPrice(1.5);
        assertEquals("The cost of the trip is: 7.5", tripCostCalculator.display());
    }
}