package topic4Exercises;


public class JFT4Ex5{
	
	public static void main(String[] args){
		
		double principle = 1000;
		double interestRate = .05;
		double interestEarned = principle * interestRate;
		double investment = principle + interestEarned;
		
		System.out.println("The principle is " + principle + " euro.");
		System.out.println("The rate of interest is " + interestRate + ".");
		System.out.println("The interest earned is " + interestEarned + ".");
		System.out.println("The value of the investment is: " + investment + " euro.");
	}
}