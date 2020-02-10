package topic4Exercises;


public class JFT4Ex7{
	
	public static void main(String[] args){
		
		double length = 25;
		double width = 42;
		double sqrFeet = length * width;
		double sqrYards = (sqrFeet / 9);
		double cost = sqrYards * 37.99;
		
		System.out.println("**************************************");
		System.out.println("        Carpeting Cost Analysis:");		
		System.out.println("**************************************");
		System.out.println("Square Feet:                          " + sqrFeet);
		System.out.println("Square Yards:                         " + sqrYards);
		System.out.println("Cost of Carpeting in Square Yards:    " + cost + " euro.");
	}
}