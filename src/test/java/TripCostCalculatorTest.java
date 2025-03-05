import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {
    @Test
    public void testCalculateTripCost() {
        assertEquals(10.0, TripCostCalculator.calculateTripCost(100, 2.0), 0.01);
        assertEquals(25.0, TripCostCalculator.calculateTripCost(250, 2.0), 0.01);
        assertEquals(37.5, TripCostCalculator.calculateTripCost(500, 1.5), 0.01);
        assertEquals(0.0, TripCostCalculator.calculateTripCost(0, 2.0), 0.01);
    }

    @Test
    public void testUserInputAndOutput() {
        String simulatedInput = "100\n2.0\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        TripCostCalculator.main(new String[]{});

        System.setIn(System.in);
        System.setOut(System.out);

        String expectedOutput = "Enter the distance to travel in km: Enter the fuel price per liter: Total cost of the trip: 10.00";

        String actualOutput = outputStream.toString().replace("\r\n", "").replace("\n", "").trim();
        assertTrue(actualOutput.contains("Total cost of the trip: 10.00"));
    }
}