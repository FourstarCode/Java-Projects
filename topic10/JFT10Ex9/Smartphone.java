package JFT10Ex9;

public class Smartphone{
	
	public String name;
	public String manufacturer;
	public float price;
	public String releaseDate;
	public float creditRemaining;
	public boolean isFullyCharged;
	
	public static int noSmartphones;
	public static float averagePrice;
	
	public void makeCall(String noToCall){
		System.out.println("Dialling number: " + noToCall);
	}
	
	public void topUpCredit(float topUpAmount){
		creditRemaining+=topUpAmount;
		System.out.println("You have successfully topped up by: " + topUpAmount
		+ "\n" + "Your new balance is: " + creditRemaining);
	}
	
	public void charge(){
		isFullyCharged = true;
		System.out.println("The smartphone is now fully recharged.");
	}
	public String toString(){
		return "Name: " + name + "\n" + "Manufacturer: " + manufacturer + "\n" + "Price: "
		+ price + "\n" + "Release Date: " + releaseDate + "\n" + "Credit Remaining: " + creditRemaining
		+ "\n" + "Fully charged: " + isFullyCharged;
	}
	
	public static float getAverage(){
		return averagePrice/noSmartphones;
	}
}