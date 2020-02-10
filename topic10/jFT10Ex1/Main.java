package jFT10Ex1;

public class Main{
	
	public static void main(String[] args){
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		p1.size = "Small";
		p1.toppings = "Ham and Pineapple";
		p1.diameter = 12.00f;
		p1.price = 10;
		
		p2.size = "Medium";
		p2.toppings = "Chicken and Mushroom";
		p2.diameter = 14.00f;
		p2.price = 12;
		
		p3.size = "Large";
		p3.toppings = "Chicken and Mushroom";
		p3.diameter = 16.00f;
		p3.price = 14;
		
		System.out.println(p1.toString());
		System.out.println(p1.eat());
		System.out.println(" ");
		
		System.out.println(p2.toString());
		System.out.println(p2.eat());
		System.out.println(" ");
		
		System.out.println(p2.toString());
		System.out.println(p2.eat());
		System.out.println(" ");
		
	}
}
		