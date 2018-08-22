package java_OOPs_Concept;

/*
 * Method overriding is used for runtime polymorphism
 * Method overriding is used to provide specific implementation of a method that is already provided by its super class
 * In method overriding, method must have same name ,same parameters, and same return type as of parent class method
 * an their must be IS-A relationship 
 * */

class Iphone 
{
	public void phone() {
		System.out.println("This is a iPhone class");
	}
}

public class OverRiding_Methord_Phone extends Iphone
{
	public void phone() {
		System.out.println("This is a methord of OverRiding_Methord_Phone class");
	}
	
	public static void main(String args[]) 
	{
		OverRiding_Methord_Phone obj = new OverRiding_Methord_Phone();
		obj.phone();
	}
}