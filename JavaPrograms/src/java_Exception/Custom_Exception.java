package java_Exception;

public class Custom_Exception 
{
	static void validate(int age) throws InvalidAgeException
	{  
	     if(age<18){
	    	 throw new InvalidAgeException("not valid to vote"); 
	     }
	     else {  
	      System.out.println("welcome to vote");  
	     }
	}
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }
	      catch(Exception ex){
	    	  System.out.println("Exception occured: "+ex);
	    	  }  
	  
	      System.out.println("\n \n rest of the code...");  
	  }
}

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String s) 
	{
		super(s);
	}
}
