package topic9Exercises;

import java.util.*;
public class JFT9Ex1
{
	public static void main(String[] args)
	{
		ArrayList<String> albums = new ArrayList<>();
		
		albums.add("Thriller");
		albums.add("The Dark Side Of the Moon");
		albums.add("Bat Out of Hell");
		albums.add("Back in Black");
		albums.add("Come On Over");
		albums.add("Led Zeppelin IV");
		albums.add("Jagged Little Pill");
		
		for(String s: albums)
		{
			System.out.println(s);
		}
	}
}