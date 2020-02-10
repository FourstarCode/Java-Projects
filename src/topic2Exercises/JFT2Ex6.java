package topic2Exercises; 
public class JFT2Ex6{
	public static void main(String[] args){
		System.out.println("Welcome to the FX Currency Converter.");
		/*Currency Conversion Rates:
		1.00 EUR = 0.697443 GBP
		1.00 EUR = 1.08901 USD
		1.00 EUR = 135.090 JPY
		*/
		double eur = 100, gbp = 0.697443, usd = 1.08901, jpy = 135.090;
		System.out.println("Euro " + eur + " will buy " + (eur * gbp) + " British Pounds.\n"
		+ "Euro " + eur + " will buy " + (eur * usd) + " American Dollars.\n"
		+ "Euro " + eur + " will buy " + (eur * jpy) +  " Japanese Yen.");
	}
}	