package java_Array;

public class AlternateAddition {

	public static void main(String[] args) 
	{
		int[] arr = {5,8,9,2,4,5,1,0,15,0,3};
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < arr.length-2; i++) 
		{
			sum = arr[i] + arr[i+2];
			System.out.println(arr[i]+" + "+ arr[i+2]+"------>"+sum);
			if (temp < sum) 
			{
				temp = sum;
			}
		}
		
		System.out.println("largest addition : "+temp);
	}

}
