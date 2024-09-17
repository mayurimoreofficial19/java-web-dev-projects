package org.launchcode;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        double numOfMiles = input.nextDouble();

        System.out.println("How much gas did you use? In gallon");
        double numGallon = input.nextDouble();

        double mpg = numOfMiles/numGallon;
        System.out.println("You are running on " + mpg + " mpg");

    }
}
