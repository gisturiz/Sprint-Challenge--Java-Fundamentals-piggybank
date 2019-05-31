package piggyBank;

import java.text.DecimalFormat;
import java.util.*;

public class Main
{

	public static void main(String[] args)
	{
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();

		piggyBank.add(new Quarter("Quarter", 1, 1));
		piggyBank.add(new Dime("Dime", 1, 1));
		piggyBank.add(new Dollar("Dollar", 5, 5));
		piggyBank.add(new Nickel("Nickel", 3, 3));
		piggyBank.add(new Dime("Dime", 7, 7));
		piggyBank.add(new Dollar("Dollar", 1, 1));
		piggyBank.add(new Penny("Penny" ,10, 10));

		System.out.println(piggyBank.toString());

		System.out.println("*** Amounts ***");

		piggyBank.forEach((v) -> System.out.println(v.getAmount()));

		double myValue = 0.0;
		for (AbstractMoney m : piggyBank)
		{
			myValue = myValue + m.getAmount();
		}

		System.out.println("The piggy bank holds " + fp.format(myValue));

	}
}