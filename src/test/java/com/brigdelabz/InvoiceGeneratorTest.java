package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        int actualResult = invoiceGenerator.calculateFare(10, 15);
        Assert.assertEquals(115, actualResult);
    }
}
