package com.brigdelabz;

public class InvoiceGenerator {
    int costOfPerKilometer = 10;
    int perMinRs = 1;

    public int calculateFare(int distance, int time) {
        return distance * costOfPerKilometer + time * perMinRs;
    }
}
