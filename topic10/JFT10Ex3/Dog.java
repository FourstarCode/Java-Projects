package JFT10Ex3;

public class Dog{
	
	public String name;
	public byte age;
	public String breed;
	
	public String makeNoise(){
		return "Woof...";
	}
	
	public String toString(){
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Breed: " + breed;
	}
}