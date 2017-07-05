package oop01;

import java.io.*;

public class ExceptionExample03 {




	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = null;
		fis = new FileInputStream("deneme.dat"); 
		int k; 

		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 
		fis.close(); 	
	}




}



