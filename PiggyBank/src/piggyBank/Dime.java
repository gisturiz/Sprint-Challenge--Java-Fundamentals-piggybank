package piggyBank;

public class Dime extends AbstractMoney
{
	public String name;
	public int quantity;

	public Dime(String name, double amount, int quantity)
	{
		super(amount);
		this.amount *= 0.10;
		this.name = name;
		this.quantity = quantity;
	}

	public Dime(String name)
	{
		this.name = name;
	}

	@Override
    public String toString()
   {
        if (amount > 0.10)
    	{
    		return
    		quantity + " " + "Dimes";
    	} else
    	{
        return
        	quantity + " " + name;
        }
    }
}