package java_collection;

import java.util.Map;
import java.util.TreeMap;

public class Map_Example {

	public static void main(String[] args) 
	{
		String arr[] = {"ijk", "lmn","abc", "def", "geh", "opq"};
		Map<Integer, String> map = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}
		
		for ( Map.Entry m:map.entrySet() ) 
		{
			System.out.println(m);
		}
	}

}
