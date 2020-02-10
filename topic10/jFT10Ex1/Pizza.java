package jFT10Ex1;

public class Pizza{
	
	public String size;
	public String toppings;
	public float diameter;
	public int price;
	
	public String eat(){
		
		return "Eat a pizza slowly, it can choke you if you eat too fast!";
	}//method
	
	public String toString(){
		
		return "Size: " + size + "\n" + "Toppings: " + toppings + "\n" 
		+ "Diameter: " + diameter
		+ "\n" + "Price: " + price;
	}//method
}//class