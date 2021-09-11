package com.company;

public class StreetBrothersTaxiRating implements ITaxiRating{
    @Override
    public String getName() {
        return "Street Brothers";
    }

    @Override
    public Double calculatePriceFrom(int distance) {
        double price = 4.0;
        price += distance * 2;
        return price;
    }
}
