package topic7Exercises;

import java.util.*;

public class JFT7Ex6
{
	public static void main(String[] args)
	{
		String currencies[] = {"GBP", "USD", "JPY"};
		float exchangeRates[] = {0.718836f, 1.12370f, 138.682f};
		
		for(int i = 0; i < currencies.length; i++)
		{
			System.out.println(currencies[i] + "\t" + exchangeRates[i]);
		}
		for(int j = 0; j < currencies.length; j++)
		{
			System.out.println("100 Euro converted to " + currencies[j] + " is: " + (100*exchangeRates[j]));
		}
	}
}