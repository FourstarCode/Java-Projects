package jft12ex7;

public class JFT12Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message1 = "Message in a bottle";
		String message2 = "Message in a jar";
		
		int length1 = message1.length();
		int length2 = message2.length();
		
		System.out.println("Message 1 length: "+ length1 + " chars.");
		System.out.println("Message 2 length: "+ length2 + " chars.");
		
		if(message1.length()>message2.length()) {
			System.out.println(message1 + " is longer than " + message2);
		}else {
			System.out.println(message2 + " is longer than " + message1);
		}
	}

}
