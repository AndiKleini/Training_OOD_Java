package com.company;

public class SonsOfUberTaxiRating implements ITaxiRating{
    @Override
    public String getName() {
        return "Sons of Uber";
    }

    @Override
    public double calculatePriceFrom(int distance) {
        double price = (double) distance * 2;
        if (distance > 10) {
            price *= 0.9;
        }
        return price;
    }
}
