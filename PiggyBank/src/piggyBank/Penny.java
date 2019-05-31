package piggyBank;

public class Penny extends AbstractMoney
{
	public String name;
	public int quantity;

	public Penny(String name, double amount, int quantity)
	{
		super(amount);
		this.amount *= 0.01;
		this.name = name;
		this.quantity = quantity;
	}

	public Penny(String name)
	{
		this.name = name;
	}

	@Override
    public String toString()
    {
        if (amount > 0.01)
    	{
    		return
    		quantity + " " + "Pennies";
    	} else
    	{
        return
        	quantity + " " + name;
        }
    }
}