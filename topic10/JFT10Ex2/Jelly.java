package JFT10Ex2;

public class Jelly{
	
	public String manufacturer;
	public float price;
	public String flavour;
	public float noCalories;
	public String expiryDate;
	
	public String setInstructions(){
		return "Leave Jelly to set in a cool environment for 1hr";
	}
	
	public String toString(){
		return "Manufacturer: " + manufacturer + "\n" + "Price: " 
		+ price + "\n" + "Flavour: " 
		+ flavour + "\n" + "No. of Calories: " 
		+ noCalories + "\n" + "Expiry Date: " + expiryDate;
	}
}