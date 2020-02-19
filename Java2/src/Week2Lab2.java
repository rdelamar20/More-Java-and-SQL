// Ryan Delamar CIS217.5927
// Winter 2020 Semester

import java.util.Scanner;

public class Week2Lab2
{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of change: ");
        int change = input.nextInt();

        int coinVals[];
        coinVals = new int[5];

        exactChange(change, coinVals);
    }

    public static void exactChange(int userTotal, int[] coinVals)
    {

        if (userTotal / 100 != 0)
        {
            coinVals[0] = userTotal / 100;
            userTotal = userTotal % 100;
            if (coinVals[0] == 1)
            {
                System.out.println(coinVals[0] + " Dollar");
            }
            else
            {
                System.out.println(coinVals[0] + " Dollars");
            }
        }

        if (userTotal / 25 != 0)
        {
            coinVals[1] = userTotal / 25;
            userTotal = userTotal - (coinVals[1] * 25);
            if (coinVals[1] == 1)
            {
                System.out.println(coinVals[1] + " Quarter");
            }
            else
            {
                System.out.println(coinVals[1] + " Quarters");
            }
        }

        if (userTotal / 10 != 0)
        {
            coinVals[2] = userTotal / 10;
            userTotal = userTotal - (coinVals[2] * 10);
            if (coinVals[2] == 1)
            {
                System.out.println(coinVals[2] + " Dime");
            }
            else
            {
                System.out.println(coinVals[2] + " Dimes");
            }
        }

        if (userTotal / 5 != 0)
        {
            coinVals[3] = userTotal / 5;
            userTotal = userTotal - (coinVals[3] * 5);
            if (coinVals[3] == 1)
            {
                System.out.println(coinVals[3] + " Nickel");
            }
            else
            {
                System.out.println(coinVals[3] + " Nickels");
            }
        }

        if (userTotal / 1 != 0)
        {
            coinVals[4] = userTotal;
            userTotal = userTotal - (coinVals[4]);
            if (coinVals[4] == 1)
            {
                System.out.println(coinVals[4] + " Penny");
            }
            else
            {
                System.out.println(coinVals[4] + " Pennies");
            }
        }
        else
        {
            System.out.println("No Change.");
        }
    }

}
