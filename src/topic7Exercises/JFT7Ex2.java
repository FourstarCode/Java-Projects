package topic7Exercises;

import java.util.*;

public class JFT7Ex2
{
	public static void main(String[] args)
	{
		float[] salary = new float[5];
		salary [0] = 24000.50f;
		salary [1] = 30432.54f;
		salary [2] = 29454.54f;
		salary [3] = 45000.00f;
		salary [4] = 20500.00f;
		
		System.out.println("There are " + salary.length + " employees.");
		System.out.println("Their salaries are:");
		for(int i = 0; i < salary.length; i++)
		{
			System.out.println(salary[i]);
		}
	}
}