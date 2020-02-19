// Ryan Delamar CIS217.5927
// Winter 2020 Semester

import java.util.Scanner;

public class ShoppingCartPrinter
{

public static void main (String args[])
{
    Scanner input = new Scanner(System.in);

    ItemToPurchase item1 = new ItemToPurchase();
    ItemToPurchase item2 = new ItemToPurchase();

    System.out.println("Item 1: ");

    System.out.println("Enter the item name: ");
    String name = input.nextLine();
    item1.setName(name);

    System.out.println("Enter the item price: ");
    int price = input.nextInt();
    item1.setPrice(price);

    System.out.println("Enter the item quantity: ");
    int quantity = input.nextInt();
    item1.setQuantity(quantity);

    input.nextLine();

    System.out.println("Item 2: ");

    System.out.println("Enter the item name: ");
    name = input.nextLine();
    item2.setName(name);

    System.out.println("Enter the item price: ");
    price = input.nextInt();
    item2.setPrice(price);

    System.out.println("Enter the item quantity: ");
    quantity = input.nextInt();
    item2.setQuantity(quantity);

    int totalCost = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

    System.out.println("TOTAL COST");
    System.out.println(item1.getName() + " " + item1.getQuantity() + " @ " + "$" + item1.getPrice() + " = " + (item1.getPrice() * item1.getQuantity()) );
    System.out.println(item2.getName() + " " + item2.getQuantity() + " @ " + "$" + item2.getPrice() + " = " + (item2.getPrice() * item2.getQuantity()) );

    System.out.println();

    System.out.println("Total: $" + totalCost);

}



}
