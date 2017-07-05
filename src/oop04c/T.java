package oop04c;

import java.io.*;

public class T {

	public static void main(String[] args) {
		B b = new B('b',19);
		A a = new A("aa",b);
		try {
			ObjectOutputStream out = new ObjectOutputStream( 
					new FileOutputStream("serializationTest.dat") );
			out.writeObject(a);
			out.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			ObjectInputStream in = new ObjectInputStream( 
					new FileInputStream("serializationTest.dat") );
			in.readObject();
			in.close();
		} 
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
