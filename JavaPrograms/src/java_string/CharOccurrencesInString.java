package java_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurrencesInString {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.println("Input the data");
		String str = scr.nextLine();
		
		CharOccurrencesInString obj = new CharOccurrencesInString();
		System.out.println(obj.getCharFreq(str));
	}
	
	public Map<Character, Integer> getCharFreq(String str)
	{
		Map<Character, Integer> charFreq = new HashMap<Character, Integer>();
		if (str != null) 
		{
			for (Character c : str.toCharArray()) 
			{
				Integer count = charFreq.get(c);
				Integer newCount = (count ==null ? 1 : count+1);
				charFreq.put(c, newCount);	
			}
		}
		return charFreq;
	}
}
