
package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius ");
        double userInput = input.nextDouble();


        do {
            if (userInput < 0) {
                System.out.println("Enter a radius ");
                userInput = input.nextDouble();
            }
            else {
                break;
            }
        }while(true);
        double areaOfCircle = Circle.getArea(userInput);
        System.out.println("The area of a circle with a radius of " + userInput + " is: " + areaOfCircle);


    }
}
