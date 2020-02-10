package JFT10Ex2;

public class Main{
	
	public static void main(String[] args){
		
		Jelly j1 = new Jelly();
		Jelly j2 = new Jelly();
		Jelly j3 = new Jelly();
		
		j1.manufacturer = "Chivery";
		j1.price = 3.50f;
		j1.flavour = "Strawberry";
		j1.noCalories = 24f;
		j1.expiryDate = "25/06/2016";
		
		j2.manufacturer = "Nestles";
		j2.price = 3.42f;
		j2.flavour = "Banana";
		j2.noCalories = 26f;
		j2.expiryDate = "27/07/2016";
		
		j3.manufacturer = "Danones";
		j3.price = 3.00f;
		j3.flavour = "Lemon";
		j3.noCalories = 28f;
		j3.expiryDate = "28/06/2015";
		
		System.out.println(j1.setInstructions());
		System.out.println(j1.toString());
		System.out.println();
		
		System.out.println(j2.setInstructions());
		System.out.println(j2.toString());
		System.out.println();
		
		System.out.println(j3.setInstructions());
		System.out.println(j3.toString());
		System.out.println();
		
	}
	
}