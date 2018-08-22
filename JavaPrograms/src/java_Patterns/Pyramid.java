package java_Patterns;

public class Pyramid {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 5-i; j > 0; j--) 
			{
				System.out.print(" ");
			}
			
			for (int k = 0; k < i*2-1; k++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

/*
 1, 3 , 5 
----*
---***
--*****
-*******
*********




*/