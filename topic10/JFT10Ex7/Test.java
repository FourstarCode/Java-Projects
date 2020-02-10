package JFT10Ex7;

public class Test{
	
	public static void main(String[] args){
		
		Sum s1 = new Sum();
		System.out.println(s1.sumTwoValues(4,5));
		System.out.println(s1.sumTwoValues(4f,5f));
		System.out.println(s1.sumTwoValues(4.0,5.0));
		System.out.println(s1.sumTwoValues((byte)4,(byte)5));
		System.out.println(s1.sumTwoValues((byte)4,5));
	}
}