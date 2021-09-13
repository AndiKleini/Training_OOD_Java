package com.company;

public class BobsCapsTaxiRating implements ITaxiRating{

    public String getName() {
        return "Bob's Caps";
    }

    public double calculatePriceFrom(int distance) {
        if (distance > 2) {
            return 3 * distance;
        } else {
            return 9.0;
        }
    }
}
