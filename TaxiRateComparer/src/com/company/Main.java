package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Compare taxi rates of:");
	    System.out.println("Bob's caps");
	    System.out.println("Street brothers");
	    System.out.println("Sons of Uber");

	    System.out.println("Please enter the distance of your tour (miles):");
	    Scanner input = new Scanner(System.in);
	    Integer distance = null;
	    while ((distance = TryParse(input.next())) == null) {
	    	System.out.println("Invalid input ... must be a number.");
		}

	    System.out.println(String.format("View Prices for %s miles.", distance));
		System.out.println(String.format("Bob's caps %s€", GetPriceForBobCars(distance)));
		System.out.println(String.format("Street brothers %s€", GetPriceForStreetBrothers(distance)));
		System.out.println(String.format("Sons of Uber %s€", GetPriceForSonsOfUber(distance)));

		System.out.println("Thanks for your request !");
    }

    private static Integer TryParse(String toParse) {
    	try {
    		return Integer.parseInt(toParse);
		} catch (NumberFormatException ex) {
    		return null;
		}
	}

	private static Double GetPriceForBobCars(int distance) {
    	 if (distance > 2) {
    	 	return Double.valueOf(3 * distance);
		 } else {
    	 	return 9.0;
		 }
	}

	private static Double GetPriceForStreetBrothers(int distance) {
		Double price = 4.0;
		price += distance * 2;
		return price;
	}

	private static Double GetPriceForSonsOfUber(int distance) {
		Double price = Double.valueOf(distance * 2);
		if (distance > 10) {
			price *= 0.9;
		}
		return price;
	}
}
