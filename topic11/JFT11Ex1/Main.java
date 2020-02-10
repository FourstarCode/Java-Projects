package JFT11Ex1;

public class Main{
	
	public static void main(String[] args){
		
		Adult a1 = new Adult();
		a1.setName("Billy White");
		a1.setAge(30);
		a1.setGender("male");
		a1.setHeight(6.5f);
		a1.setWeight(11.0f);
		a1.setPpsNo("5645614F");
		a1.setOccupation("Software Developer");
		a1.setIsMarried(true);
		a1.setIsCarOwner(true);
		
		System.out.println(a1.toString() + "\n" + a1.eat() + "\n" + a1.drive());
		
		Child c1 = new Child();
		c1.setName("Frank Davis");
		c1.setAge(3);
		c1.setGender("male");
		c1.setHeight(1.5f);
		c1.setWeight(3.0f);
				
		System.out.println(c1.toString() + "\n" + c1.eat() + "\n" + c1.swim());
		
		Baby b1 = new Baby();
		b1.setName("Gillian Taylor");
		b1.setAge(1);
		b1.setGender("female");
		b1.setHeight(0.6f);
		b1.setWeight(1.0f);
		b1.setIsTeething(true);
		System.out.println(b1.toString() + "\n" + b1.sleep() + "\n" + b1.swim());
	}
}