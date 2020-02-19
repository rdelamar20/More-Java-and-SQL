// Ryan Delamar CIS217.5927
// Winter 2020 Semester

public class ItemToPurchase
{
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase()
    {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public void setName(String name)
    {
        this.itemName = name;
    }

    public void setPrice(int price)
    {
        this.itemPrice = price;
    }

    public void setQuantity(int quantity)
    {
        this.itemQuantity = quantity;
    }

    public String getName()
    {
        return this.itemName;
    }

    public int getPrice()
    {
        return this.itemPrice;
    }

    public int getQuantity()
    {
        return this.itemQuantity;
    }

    public void clearanceSale()
    {
        this.itemPrice = this.itemPrice / 2;
    }
    public String printInfo()
    {
        return this.itemName + this.itemPrice + this.itemQuantity;
    }


}
