package jft14ex4;

import java.util.*;
public class JFT14Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String destinations[] = {"Cork","Athlone","Limerick","Sligo","Dublin"};
		Scanner k = new Scanner(System.in);
		int input = 0;
		boolean validDataEntry = false;
		
		for(int i = 0;i<destinations.length;i++)
		{
			System.out.println((i+1) + ": " + destinations[i]);
		}
		
		do {
			try {

				System.out.print("Enter a number to make your selection: ");
				input = k.nextInt();
				System.out.println("You will have a great time in: " + destinations[input - 1] + "!");
				validDataEntry = true;
			} catch (InputMismatchException e) {
				System.out.println("Incorrect date value entered.");
				k.nextLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("A vale from 1-5 should be entered");
			} 
		} while (validDataEntry==false);
	}

}
