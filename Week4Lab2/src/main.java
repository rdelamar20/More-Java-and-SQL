import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileInputStream;

public class main
{

    public static void main(String args[]) throws IOException {
        FileInputStream fileByteStream = null;
        Scanner inFS = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Opening file NamesAndAges.txt");
        fileByteStream = new FileInputStream("NamesAndAges.txt");
        inFS = new Scanner(fileByteStream);

        System.out.println("Reading File...");

        name = inFS.next();
        while (!name.equals("-1"))
        {
            try {
                age = inFS.nextInt();
                System.out.println(name + " " + (age + 1));
            }
            catch (InputMismatchException e)
            {
                e.printStackTrace();
                break;
            }

            name = inFS.next();
        }

        System.out.println("Closing file NamesAndAges.txt");
        fileByteStream.close();

    }


}
