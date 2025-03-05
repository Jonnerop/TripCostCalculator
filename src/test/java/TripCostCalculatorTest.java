import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {
    @Test
    public void testCalculateTripCost() {
        assertEquals(10.0, TripCostCalculator.calculateTripCost(100, 2.0), 0.01);
        assertEquals(25.0, TripCostCalculator.calculateTripCost(250, 2.0), 0.01);
        assertEquals(37.5, TripCostCalculator.calculateTripCost(500, 1.5), 0.01);
        assertEquals(0.0, TripCostCalculator.calculateTripCost(0, 2.0), 0.01);
        assertEquals(0.0, TripCostCalculator.calculateTripCost(0, 0.0), 0.01);
    }
}