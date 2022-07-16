package com.brigdelabz;

public class InvoiceGenerator {
    public static double CostOfPerKilometer = 10;
    public static double PerMinRs = 1;
    public static double TotalRs = 0;

    public double calculateFare(int distance, int time) {
        return distance * CostOfPerKilometer + time * PerMinRs;
    }

    public double calculateMultiplyFare(Ride[] ride) {
        for (Ride rides : ride) {
            TotalRs += calculateFare(rides.distance, rides.time);
        }
        return TotalRs;
    }
}
