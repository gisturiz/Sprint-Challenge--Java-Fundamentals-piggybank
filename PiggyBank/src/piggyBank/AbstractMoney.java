package piggyBank;

public abstract class AbstractMoney
{
	double amount;

	public AbstractMoney(double amount)
	{
		this.amount = amount;
	}

	public AbstractMoney()
	{
		amount = 1;
	}

	public double getAmount()
	{
		return amount;
	}

}