package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		   System.out.println("Enter a character or string: it will quit as soon as it encounters \"q\"!");

		   try{		
			   BufferedReader reader = new BufferedReader (new InputStreamReader(System.in , "UTF-8"));	   
			   byte[] arr = new byte[]{};
			   //StringBuilder sb = new StringBuilder(IOUtils.);
			   int ch;	   
				   while ((ch = reader.read())!=-1)	{
					   System.out.print((char)ch);
					   if(ch=='q'){
						   System.out.println("oops!  You typed \"q\"! bye bye");
						   break;
					   }
				   }			   
		   }
		   catch (IOException e){
		     
	   }	
     }	
}
