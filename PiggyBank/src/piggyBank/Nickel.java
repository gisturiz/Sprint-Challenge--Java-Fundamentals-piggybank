package piggyBank;

public class Nickel extends AbstractMoney
{
	public String name;
	public int quantity;

	public Nickel(String name, double amount, int quantity)
	{
		super(amount);
		this.amount *= 0.05;
		this.name = name;
		this.quantity = quantity;
	}

	public Nickel(String name)
	{
		this.name = name;
	}

	@Override
    public String toString()
    {
        if (amount > 0.05)
    	{
    		return
    		quantity + " " + "Nickels";
    	} else
    	{
        return
        	quantity + " " + name;
        }
    }
}