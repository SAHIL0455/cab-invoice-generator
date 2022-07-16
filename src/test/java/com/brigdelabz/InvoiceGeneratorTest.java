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
    public void givenMultiplyDistanceAndTime_shouldReturnTotalFare() {
        Ride[] multiplyRides = {new Ride(5, 10),
                new Ride(6, 12)};
        double actualResult = invoiceGenerator.calculateMultiplyFare(multiplyRides);
        Assert.assertEquals(132, actualResult, 0.0);
    }
}
