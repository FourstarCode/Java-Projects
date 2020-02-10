package JFT10Ex6;

public class VowelCount{
	
	public String vowelCount(String message){
		
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		
		char letter;
		
		for(int i = 0; i <message.length(); i++){
			letter = message.charAt(i);
			letter = Character.toLowerCase(letter);
			switch (letter){
				case 'a':
					aCount++;
					break;
				case 'e':
					eCount++;
					break;
				case 'i':
					iCount++;
					break;
				case 'o':
					oCount++;
					break;
				case 'u':
					uCount++;
					break;
					
			}
		}
		
		return "No. of vowels: " + (aCount+eCount+iCount+oCount+uCount) + "\n" 
		+ "a count: " + aCount + "\n" + "e count: " + eCount + "\n" + "i count: " + iCount + "\n"
		+ "o count: " + oCount + "\n" + "u count: " + uCount + "\n";
		
	}
	
}