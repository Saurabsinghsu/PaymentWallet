package java_string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class DateValidation {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		String date = scr.nextLine();
		DateValidation obj = new DateValidation();
		obj.dateValidater(date);
		
	}
	
	public static boolean dateValidater(String strdate) 
	{
		if (strdate.trim().equals("")) 
		{
			return true;
		} 
		else {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			
			try {
				Date javaDate =df.parse(strdate);
				System.out.println(strdate+"  IS valid date formate");
			} 
			catch (Exception e) {
				System.out.println(strdate+"  Invalid date formate");
				return false;
			}
			return true;
		}
		
		
	}

}
