package jft14ex5;

import java.util.*;

public class JFT14Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "";
		char extractedLetter;
		int userInput = 0;
		boolean validDataEntry = false;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter a message: ");
		message = k.nextLine();
		
		System.out.print("Now enter the position of the"
				+ " character that you wish to extract: ");
		do {
			try {
				extractedLetter = message.charAt(k.nextInt()+1);
				System.out.print("The extracted character from "
						+ "your message is: " + extractedLetter);
				validDataEntry = true;
			}catch(InputMismatchException e) {
				System.out.print("Error: Please enter a number to indicate the position: ");
				k.nextLine();
			}catch(StringIndexOutOfBoundsException e) {
				System.out.print("Error: Please enter a number less than " + message.length()
				+ " characters: ");
			}
		}while(validDataEntry == false);
				
	}

}
