package java_string;

import java.util.Scanner;

public class RecursiveStringReversal 
{
	String reverse = "";
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		String string = scr.nextLine();
		
		RecursiveStringReversal obj = new RecursiveStringReversal();
		System.out.println("Reversed string is :"+ obj.reverseString(string));
	}

	private String reverseString(String str) 
	{
		if(str.length()<=1)
		{
			return str;
		}
		else{
			reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
		}
	}

}
