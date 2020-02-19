// Ryan Delamar CIS217.5927
// Winter 2020 Semester

// An extremely basic string replacement strategy. Hard coded for just a few different inputs.

import java.util.Scanner;

public class Week1Lab2 {

    public static void main (String args[])
    {

        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter Text:");
        String check = input.nextLine().toUpperCase();
        System.out.println("You entered: " + check);

        String altered = check;


        //IF structure to check for the specific substrings in the user input.
        if (check.contains("BFF"))
        {

            System.out.println("Replaced 'BFF' with 'BEST FRIEND FOREVER'.");
            System.out.println("Expanded: " + altered.replace("BFF", "BEST FRIEND FOREVER"));


        }

        if (check.contains("IDK"))
        {

            System.out.println("Replaced 'IDK' with 'I don't know'.");
            System.out.println("Expanded: " + altered.replace("IDK", "I DON'T KNOW"));

        }

        if (check.contains("JK"))
        {

            System.out.println("Replaced 'JK' with 'JUST KIDDING'.");
            System.out.println("Expanded: " + altered.replace("JK", "JUST KIDDING"));

        }

        if (check.contains("TMI"))
        {

            System.out.println("Replaced 'TMI' with 'TOO MUCH INFORMATION'.");
            System.out.println("Expanded: " + altered.replace("TMI", "TOO MUCH INFORMATION"));

        }

        if (check.contains("TTYL"))
        {

            System.out.println("Replaced 'TTYL' with 'TALK TO YOU LATER'.");
            System.out.println("Expanded: " + altered.replace("TTYL", "TALK TO YOU LATER"));

        }

    }

}
