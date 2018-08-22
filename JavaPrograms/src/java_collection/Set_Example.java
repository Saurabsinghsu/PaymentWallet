package java_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Example 
{
	public static void main(String[] args) 
	{
//		int arr[] = {16, 20, 15, 25, 8, 11};
		String arr[] = {"ijk", "lmn","abc", "def", "geh", "opq"};
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (String integer : set) {
			System.out.println(integer);
		}
	}
}
