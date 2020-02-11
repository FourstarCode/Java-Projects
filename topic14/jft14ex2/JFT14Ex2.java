package jft14ex2;

public class JFT14Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			result = num1 / num2;
			System.out.printf("The result of %d divided by %d is %d",num1,num2,result);
		}catch(ArithmeticException e) {
			System.out.println("Error: Arithmetic Exception. Cannot /0. Program Closing.");
		}
		
	}

}
