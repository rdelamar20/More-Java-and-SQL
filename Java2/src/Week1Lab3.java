// Ryan Delamar CIS217.5927
// Winter 2020 Semester

import java.util.Scanner;


public class Week1Lab3 {


    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to check: ");
        String check = input.nextLine();

        String checknospace = check.replaceAll("\\s+","");

        int length = checknospace.length();
        String altered = "";

        for (int i = length - 1; i >= 0; i--)
        {
            altered = altered + checknospace.charAt(i);
        }

        if (checknospace.equals(altered))
        {
            System.out.println(check + " is a palindrome.");
        }
        else
        {
            System.out.println(check + " is not a palindrome.");
        }

    }


}
