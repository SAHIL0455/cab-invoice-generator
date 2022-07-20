package com.brigdelabz;

public class InvoiceGenerator {
    public static double Cost_Of_Per_Kilometer = 10;
    public static double Per_Min_Rs = 1;
    public static double Total_Rs = 0;
    public static double Total_Price = 0;
    public static double Total_Ride = 0;
    public static double Total_Average_Fare = 0;
    public static double Min_Fare = 5;
    public static double Cost_Of_Preminum_Ride_Per_Km = 15;
    public static int Per_Min_Rs_Preminum = 2;
    public static double Min_Fare_Preminum = 20;
    public double calculateFarePreminum(double distance, double time){
        double price = distance * Cost_Of_Preminum_Ride_Per_Km+time*Per_Min_Rs_Preminum;
        return Math.max(price,Min_Fare_Preminum);
    }

    public double calculateFare(double distance, double time) {
        double price = distance * Cost_Of_Per_Kilometer + time * Per_Min_Rs;
        Total_Price += price;
        return Math.max(price, Min_Fare);
    }

    public double calculateMultiplyFare(Ride[] ride) {
        for (Ride rides : ride) {
            Total_Rs += calculateFare((int) rides.distance, (int) rides.time);
        }
        Total_Ride = ride.length;
        Total_Average_Fare = Total_Rs / Total_Ride;
        return Total_Rs;
    }
}
