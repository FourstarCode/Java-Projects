package demos;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner Object
		Scanner k = new Scanner(System.in);
		
		//Create variables to hold user entered values
		int numerator = 0;
		int denominator = 0;
		int result = 0;
		
		try {
			System.out.print("Enter numerator...");
			numerator = k.nextInt();
			
			System.out.print("Enter denominator..");
			denominator = k.nextInt();
			
			result = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + result);
			
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by 0.");
			
		}catch(InputMismatchException e) {
			System.out.println("Please enter a whole number.");
		}
		
		System.out.println("After the exception handling code.....");
	}

}
