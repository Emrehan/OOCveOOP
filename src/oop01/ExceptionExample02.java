package oop01;

import java.io.*;

public class ExceptionExample02 {

	public static void main(String args[]) throws IOException 
	{
		FileInputStream fis = null;
		/*This constructor FileInputStream(File filename)
		 * throws FileNotFoundException which is a checked
		 * exception*/
		fis = new FileInputStream("deneme.dat"); 
		int k; 

		/*Method read() of FileInputStream class also throws 
		 * a checked exception: IOException*/
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 

		/*The method close() closes the file input streamIt throws IOException*/
		fis.close(); 	
	}	   

}



