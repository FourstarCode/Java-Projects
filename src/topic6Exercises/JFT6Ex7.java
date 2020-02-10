package topic6Exercises;


public class JFT6Ex7{
	
	public static void main(String[] args){
		
		int productSold = 1000;
		int yearsServed = 15;
		int totalSales = 10000;
				
		String message;
		
		message = ((productSold<=1000)&&(yearsServed>=20)&&(totalSales>=10000))?("You have qualified for a bonus"):("You have not qualified for a bonus");
		System.out.println(message);
	}
}
		