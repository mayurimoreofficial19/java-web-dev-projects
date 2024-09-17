package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width : ");
        double width = input.nextDouble();

        System.out.println("Enter length : ");
        double length = input.nextDouble();

        System.out.println("Area of Rectangle : " + (width * length));
    }
}
