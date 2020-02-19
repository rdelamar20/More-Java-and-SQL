import java.util.InputMismatchException;
        import java.util.Scanner;

public class main
{

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter names and ages (enter -1 to end): ");
        name = scnr.next();
        while (!name.equals("-1"))
        {
            try {
                age = scnr.nextInt();
                System.out.println(name + " " + (age + 1));
            }
            catch (InputMismatchException e)
            {
                e.printStackTrace();
                break;
            }

            name = scnr.next();
        }

    }


}
