package JFT10Ex10;

public class Test{
	
	public static void main(String[] args){
		IQ i1 = new IQ();
		IQ i2 = new IQ();
		IQ i3 = new IQ();
		
		i1.setName("James Devine");
		i1.setAge(46);
		i1.setIQScore(87f);
		System.out.println(i1.toString());
		System.out.println(i1.iQReport());
		
		i2.setName("Helena Smith");
		i2.setAge(126);
		i2.setIQScore(101f);
		System.out.println(i2.toString());
		System.out.println(i2.iQReport());
		
		i3.setName("Daniel Jones");
		i3.setAge(27);
		i3.setIQScore(1510f);
		System.out.println(i3.toString());
		System.out.println(i3.iQReport());
	}
}