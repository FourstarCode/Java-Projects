package topic7Exercises;

import java.util.*;

public class JFT7Ex3
{
	public static void main(String[] args)
	{
		int student[] = new int[6];
		student[0] = 16;
		student[1] = 16;
		student[2] = 17;
		student[3] = 16;
		student[4] = 17;
		student[5] = 16;
		
		System.out.println("There are " + student.length + " students.");
		System.out.println("Their ages are: ");
		for(int i = 0; i < student.length; i++)
		{
			System.out.println(student[i]);
		}
	}
		
}