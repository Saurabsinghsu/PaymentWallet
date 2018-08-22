package java_collection;

import java.util.ArrayList;
import java.util.List;

public class List_Example 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.add(21);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
