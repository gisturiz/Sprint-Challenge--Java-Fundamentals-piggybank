package piggyBank;

public class Quarter extends AbstractMoney
{
	public String name;
	public int quantity;

	public Quarter(String name, double amount, int quantity)
	{
		super(amount);
		this.amount *= 0.25;
		this.name = name;
		this.quantity = quantity;
	}

	public Quarter(String name)
	{
		this.name = name;
	}

	@Override
    public String toString()
    {
    	if (amount > 0.25)
    	{
    		return
    		quantity + " " + "Quarters";
    	} else
    	{
        return
        	quantity + " " + name;
        }
    }
}