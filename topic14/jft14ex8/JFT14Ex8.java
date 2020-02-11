package jft14ex8;

import java.io.*;

public class JFT14Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFT14Ex8().readFromFile();
	}
	
	public void readFromFile() {
		
		File file = new File("My Poem.txt");
		
		try {
			//Create a FileReader objecyt
			FileReader fr = new FileReader(file);
			
			//Create a Buffered Reader object.
			//It requires a reference to a FileReader object.
			BufferedReader br = new BufferedReader(fr);
			
			//Read in the first line
			String line = br.readLine();
			
			//Read in remaining lines(if any)
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			System.out.println("The contents of the text file have been successfully read!");
			}catch(IOException e) {
				System.out.println("Unable to read from the file at this time");
		}
	}
}
