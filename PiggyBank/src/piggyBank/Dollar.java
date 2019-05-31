package piggyBank;

public class Dollar extends AbstractMoney
{
	public String name;
	public int quantity;

	public Dollar(String name, double amount, int quantity)
	{
		super(amount);
		this.amount *= 1.00;
		this.name = name;
		this.quantity = quantity;
	}

	public Dollar(String name)
	{
		this.name = name;
	}

	@Override
    public String toString()
    {
        return
        	"$" + quantity + " ";
    }
}