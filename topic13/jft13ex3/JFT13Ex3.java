package jft13ex3;

import java.util.*;
import java.text.*;

public class JFT13Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		DecimalFormat df= new DecimalFormat(".00");
		
		double decNo = 0.0;
		System.out.print("Enter a decimal no: ");
		decNo = s.nextDouble();
		
		System.out.println("Using decimal format object: " + df.format(decNo));
		System.out.printf("Using printf() method %.2f",decNo);
		
		
	}

}
