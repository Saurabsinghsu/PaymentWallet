package tricky_programs;

import java.util.Scanner;

public class EvenOddNumber 
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
//		if ((num & 1)==0) 
//		{
//			System.out.println("even number");
//		}
//		else{
//			System.out.println("Odd number");
//		}
		
		//using bitwise shift
		if ( ( num >> 1) << 1 == num) 
		{
			System.out.println("even number");
		} 
		else {
			System.out.println("Odd number");
		}
	}
}
