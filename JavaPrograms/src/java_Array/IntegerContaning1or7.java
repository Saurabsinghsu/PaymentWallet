package java_Array;


public class IntegerContaning1or7 
{
	public static void main(String args[]) 
	{
		for (int i = 0; i < 100; i++) 
		{
			int num =i;
			while (num>0) 
			{
				int rem = i%10;
				num = num/10;
				if(rem==1 || rem==7 || num ==1 || num == 7)
				{
					System.out.println(i);
				}
				break;
			}
		}
			
	}
}
