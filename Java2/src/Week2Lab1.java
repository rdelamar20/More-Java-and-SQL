// Ryan Delamar CIS217.5927
// Winter 2020 Semester

import java.util.Arrays;
import java.util.Scanner;


public class Week2Lab1 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of words you would like to enter: ");
        int length = input.nextInt();

        String StringArray[];
        StringArray = new String[length];

        getUserValues(StringArray, length, input);
        frequencies(StringArray, length);


    }

    public static void getUserValues(String[] myArr, int arrSize, Scanner scnr)
    {

        for (int i = 0; i < arrSize; i++ )
        {
            System.out.println("Enter a value: ");
            myArr[i] = scnr.next();

        }

    }

    public static void frequencies(String arr[], int n)
    {

        boolean checked[] = new boolean[n];
        Arrays.fill(checked, false);

        for (int i = 0; i < n; i++)
        {
            if (checked[i] == true)
                continue;

            int count = 1;

            for (int f = i + 1; f < n; f++)
            {
                if(arr[i] == arr[f])
                {
                    checked[f] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }


    }



}
