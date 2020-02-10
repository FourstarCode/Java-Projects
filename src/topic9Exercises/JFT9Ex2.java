package topic9Exercises;

import java.util.*;
public class JFT9Ex2
{
	public static void main(String[] args)
	{
		ArrayList<String> destinations = new ArrayList<>();
		
		destinations.add("Ibiza");
		destinations.add("Gran Canaria");
		destinations.add("Nice");
		destinations.add("Tropea");	
		
		for(int i = 0; i < destinations.size();i++)
		{
			System.out.println(destinations.get(i));
		}
		
		System.out.println("");
		System.out.println(destinations.isEmpty());
		System.out.println(destinations.size());
		System.out.println(destinations.indexOf("Tropea")); 
		destinations.add(2,"Fuerteventura");
		destinations.remove("Gran Canaria");
		System.out.println(destinations.contains("Nice"));
	}
}