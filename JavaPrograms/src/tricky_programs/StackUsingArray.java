package tricky_programs;

import java.util.Iterator;


class ArrStack
{
	int maxSiz = 100;
	int top ;
	int arr[] = new int[maxSiz];
	
	public ArrStack() {
		top = -1;
	}
	
	boolean isEmpty()
	{
		return (top<0) ;
	}
	
	int top()
	{
		return arr[top];
	}
	
	boolean push(int num)
	{
		if(top >= maxSiz-1)
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			arr[++top] = num;
			return true;
		}
	}
	
	boolean pop()
	{
		if(top < 0)
		{
			System.out.println("Stack underflow");
			return false;
		}
		else {
			int popedElement = arr[top--];
			System.out.println(popedElement +" poped from the stack");
			return true;
		}
	}	
}

public class StackUsingArray 
{
	public static void main(String args[]) 
	{
		ArrStack obj = new ArrStack();
		obj.push(23);
		obj.push(10);
		obj.push(50);
		
		obj.pop();
		System.out.println("now element at top of array is :"+obj.isEmpty());
	}
}
