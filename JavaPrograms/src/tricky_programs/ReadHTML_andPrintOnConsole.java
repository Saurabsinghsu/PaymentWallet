package tricky_programs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadHTML_andPrintOnConsole 
{
	public static void main(String[] args) throws IOException 
	{
		URL urlObj = new URL("http://www.fetagracollege.org");
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(urlObj.openStream()));
		
		String inputLine ;
		while ((inputLine = bfReader.readLine()) != null) 
		{
			System.out.println(inputLine);
		}
		bfReader.close();
	}
}
