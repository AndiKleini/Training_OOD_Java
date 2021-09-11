package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    System.out.println("Compare taxi rates of:");
	    List<ITaxiRating> getTaxRating = GetTaxRatings();
	    getTaxRating.forEach((rating) -> System.out.println(rating.getName()));

	    System.out.println("Please enter the distance of your tour (miles):");
	    Scanner input = new Scanner(System.in);
	    Integer distance;
	    while ((distance = TryParse(input.next())) == null) {
	    	System.out.println("Invalid input ... must be a number.");
		}

	    System.out.printf("View Prices for %s miles.%n", distance);

		Integer finalDistance = distance;
		getTaxRating.forEach(
				(rating) ->
						System.out.printf(
								"%1$s price: %2$s €%n",
								rating.getName(),
								rating.calculatePriceFrom(finalDistance).toString()));

		System.out.println("Thanks for your request !");
    }

    private static Integer TryParse(String toParse) {
    	try {
    		return Integer.parseInt(toParse);
		} catch (NumberFormatException ex) {
    		return null;
		}
	}

	private static List<ITaxiRating> ratings;

	private static List<ITaxiRating> GetTaxRatings() {
    	if (ratings == null) {
    		ratings = Arrays.asList(
							new BobsCapsTaxiRating(),
							new SonsOfUberTaxiRating(),
							new StreetBrothersTaxiRating()) ;
		}
    	return ratings;
	}
}
