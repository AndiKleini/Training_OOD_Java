package com.company;

public class BobsCapsTaxiRating implements ITaxiRating{

    public String getName() {
        return "Bob's Caps";
    }

    public Double calculatePriceFrom(int distance) {
        if (distance > 2) {
            return (double) (3 * distance);
        } else {
            return 9.0;
        }
    }
}
