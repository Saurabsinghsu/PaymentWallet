package tricky_programs;

public class SingletonClass_Example 
{
	private static SingletonClass_Example obj = new SingletonClass_Example(); //early object creation
	
	private SingletonClass_Example(){}

	public static SingletonClass_Example getObj() {
		return obj;
	}
	
}
