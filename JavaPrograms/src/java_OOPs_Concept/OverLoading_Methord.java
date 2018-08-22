package java_OOPs_Concept;

/*
 * It is a compile time polymorphism
 * Method Overloading increases the readability of the program
 * Method overloading deals with multiple methods having same name but different parameters or different parameter type
 * 
 * */

public class OverLoading_Methord 
{
	private int Add(int a, int b) {
		return a+b;
	}
	
	private int Add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) 
	{
		OverLoading_Methord obj = new OverLoading_Methord();
		System.out.println("Addition of numbers 100 and 200 is :\t"+obj.Add(100, 200));
		System.out.println("Addition of numbers 100 ,200 and 300 is :\t"+obj.Add(100, 200, 300));
	}

}
