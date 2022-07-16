package com.brigdelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator;

    @Before
    public void givenConstractor() {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        double actualResult = invoiceGenerator.calculateFare(10, 15);
        Assert.assertEquals(115, actualResult, 0.0);
    }

    @Test
    public void givenMultiplyDistanceAndTime_shouldReturnTotalFare_TotalRide_TotalAverageFare() {
        Ride[] multiplyRides = {new Ride(5, 10),
                new Ride(6, 12)};
        double actualResult = invoiceGenerator.calculateMultiplyFare(multiplyRides);
        Assert.assertEquals(132.0, actualResult, 0.0);

        double actualResult1 = invoiceGenerator.TotalRide;
        Assert.assertEquals(2, actualResult1, 0.0);

        double actualResult2 = invoiceGenerator.TotalAverageFare;
        Assert.assertEquals(66, actualResult2, 0.0);
    }
}
