package jft14ex6;
import java.util.*;

public class JFT14Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFT14Ex6().stringExtract();		
	}//main
	
	public void stringExtract() {
		Scanner k = new Scanner(System.in);
		
		System.out.print("Enter a message: ");

		String message = k.nextLine();
		
		String[] split = message.split(" ");
		
		String stringExtract = "";
		
		boolean validDataEntered = false;
		
		do {
			try {
				System.out.print("Enter the position of the word to extract"
						+ ": For Example: 2: ");
				int position = k.nextInt();
				stringExtract = split[position-1];
				System.out.print("Extracted Word: " + stringExtract);
				validDataEntered = true;
			}catch(InputMismatchException e) {
				System.out.println("Enter a number not text.");
				k.nextLine();
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("Enter a number < " + split.length);
				k.nextLine();
			}
		}while(validDataEntered == false);
	}
}
