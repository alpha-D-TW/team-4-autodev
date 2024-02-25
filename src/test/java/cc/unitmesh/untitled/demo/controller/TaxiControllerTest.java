package cc.unitmesh.untitled.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxiControllerTest {

    @Test
    public void testCalculate_5km_noWaiting() {
        TaxiController taxiController = new TaxiController();
        double result = taxiController.calculate(5, 0);
        Assertions.assertEquals(4.0, result);
    }

    @Test
    public void testCalculate_5km_withWaiting() {
        TaxiController taxiController = new TaxiController();
        double result = taxiController.calculate(5, 10);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testCalculate_8km_noWaiting() {
        TaxiController taxiController = new TaxiController();
        double result = taxiController.calculate(8, 0);
        Assertions.assertEquals(6.4, result);
    }

    @Test
    public void testCalculate_8km_withWaiting() {
        TaxiController taxiController = new TaxiController();
        double result = taxiController.calculate(8, 10);
        Assertions.assertEquals(8.9, result);
    }
}
