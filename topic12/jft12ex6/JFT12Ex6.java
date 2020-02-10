package jft12ex6;

public class JFT12Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "javabeans";
		String actualPassword = "JAVABEANs";
		
		password = password.toUpperCase();
		actualPassword = actualPassword.toUpperCase();
		
		if(password.equals(actualPassword)) {
			System.out.println("Log-on successful");
		}
	}

}
