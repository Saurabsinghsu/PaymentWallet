package java_collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

	public static void main(String[] args) 
	{
		OddNumbers obj = new OddNumbers();
		System.out.println(obj.oddNumbers(5, 20));
	}
	
	private List<Integer> oddNumbers(int l, int r) 
    {
        List<Integer> arrList = new ArrayList<Integer>();
        
        for(int i=l ; i<=r ; i++)
        {
            if((i%2) != 0)
            {
                arrList.add(i);
            }
        }
        return arrList;
    }

}
