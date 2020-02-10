package JFT11Ex2;

public class Main{
	
	public static void main(String[] args){
		
		Car c1 = new Car("Subaru Hatchback",53.45f,"89C4545",true);
		
		System.out.println(c1.toString() + "\n" + c1.brake() + "\n" + c1.accelerate());
		System.out.println();
		
		Car c2 = new Car();
		c2.setManufacturer("Toyota Carola");
		c2.setEngineSize(45.44f);
		c2.setRegistrationNo("90C4343");
		c2.setNCT(true);
		
		System.out.println(c2.toString() + "\n" + c2.brake() + "\n" + c2.accelerate());
		System.out.println();
		
		System.out.println(Car.getNoCarsProduced() + " cars have been produced");
		
		Truck t1 = new Truck("Ford Transit");
		
		System.out.println(t1.toString() + "\n" + t1.brake() + "\n" + t1.accelerate());
		System.out.println();
		
		Truck t2 = new Truck();
		t2.setManufacturer("Hyundai Pick-Up");
		t2.setEngineSize(89.45f);
		t2.setRegistrationNo("99C5344");
		t2.setNCT(true);
		t2.setIsTrailer(false);
		
		
		System.out.println(t2.toString() + "\n" + t2.brake() + "\n" + t2.accelerate());
		System.out.println();
	}
}