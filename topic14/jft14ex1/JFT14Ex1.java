package jft14ex1;

public class JFT14Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "two";
		int parsedValue = 0;
		
		try {
			parsedValue = Integer.parseInt(value);
		}catch(NumberFormatException e) {
			System.out.println("Error: Unable to parse data. Program closing.");
		}
	}

}
