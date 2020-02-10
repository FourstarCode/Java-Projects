package topic4Exercises;

public class JFT4Ex2{
	public static void main(String[] args){
		double priceBeforeVAT = 14.50;
		double vAT = priceBeforeVAT*0.23;
		double totalPrice = 0;
		
		
		totalPrice = priceBeforeVAT + vAT;
		
		System.out.println("Purchase Amount: " + priceBeforeVAT);
		System.out.println("Vat Payable: " + vAT);
		System.out.println("Total Price: " + totalPrice);
	}
}
			