package topic7Exercises;

import java.util.*;

public class JFT7Ex5
{
	public static void main(String[] args)
	{
		String names[] = {"John Hayes", "Michele Smyth", "Frankie Walsh"};
		int ages[] = {30,24,20};
		String degree[] = {"Sports Science", "Law", "Computer Science"};
		
		for(int i = 0; i < names.length; i++)
		{
			System.out.println("Name: " + names[i] + "\t Age: " + ages[i] + "\t Degree Programme: " + degree[i]);
		}
	}
}