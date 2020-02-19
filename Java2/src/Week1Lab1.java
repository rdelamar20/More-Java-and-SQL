// Ryan Delamar CIS217.5927
// Winter 2020 Semester

// A simple program that calculates the area of a wall, and the amount of paint needed to paint it in square feet.

import java.util.Scanner;

public class Week1Lab1 {

    public static void main (String args[])
    {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter wall height (feet): ");
    Double height = input.nextDouble();

    System.out.println("Please enter wall width (feet): ");
    Double width = input.nextDouble();

    // Area Calculation
    Double area = width * height;
    System.out.println("Wall Area: " + area + " square feet");

    // Decalring a Constant Double
    final double gallonarea = 350;

    // Calculating gallons of paint required to cover the area input
    double paint = area / gallonarea;
    System.out.println("Paint Needed: " + paint + " gallons");

    int cans = (int) Math.ceil(paint);

    System.out.println("Cans Needed : " + cans + " can(s)");

    }

}
