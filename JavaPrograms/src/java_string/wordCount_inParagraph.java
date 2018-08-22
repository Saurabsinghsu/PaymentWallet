package java_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wordCount_inParagraph 
{
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		String paraStr = scr.nextLine();
		wordCount_inParagraph obj = new wordCount_inParagraph();
		System.out.println(obj.wordFreqCount(paraStr));
	}
	
	private Map<String, Integer> wordFreqCount(String str) 
	{
		String[] wordArray = str.split(" "); 
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		if (str != null) 
		{
			for (String word : wordArray) 
			{
				Integer count = wordMap.get(word);
				Integer newCount = (count == null ? 1 : count+1);
				wordMap.put(word, newCount);
			}
		}
		
		return wordMap;
	}

}
  