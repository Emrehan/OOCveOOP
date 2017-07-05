package oop04a.classexample;

import java.io.File;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		String name = "Jon";
		
		Person jon = new Person(name);
		
		Cat garfield = new Cat("Garfield");
		Dog lessie = new Dog("Lessie");
		
		try {
			jon.addPet(garfield);
			jon.addPet(garfield);
		} 
		catch (DuplicateInformation e) {
			e.printStackTrace();
		}

		try {
			jon.addPet(lessie);
		} 
		catch (DuplicateInformation e) {
			e.printStackTrace();
		}		
		
		jon.savePets();
		
		analyzePath(name+"sPets.dat");
		
		LinkedList<Pet> pets = jon.loadPets();
		
		for( Pet pet : pets ){
			Pet aPet = pet;
			System.out.println("pet name = " + aPet.getName());
		}
		
		Pet p = jon.searchPet("Garfield");
		System.out.println("pet name = " + p.getName());
	}

	   // display information about file user specifies
	   public static void analyzePath( String path )
	   {
	      // create File object based on user input
	      File name = new File( path );

	      if ( name.exists() ) // if name exists, output information about it
	      {
	         // display file (or directory) information
	         System.out.printf(
	            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n",
	            name.getName(), " exists",
	            ( name.isFile() ? "is a file" : "is not a file" ),
	            ( name.isDirectory() ? "is a directory" : 
	               "is not a directory" ),
	            ( name.isAbsolute() ? "is absolute path" : 
	               "is not absolute path" ), "Last modified: ",
	            name.lastModified(), "Length: ", name.length(), 
	            "Path: ", name.getPath(), "Absolute path: ",
	            name.getAbsolutePath());


	      } // end outer if
	      else // not file or directory, output error message
	      {
	         System.out.printf( "%s %s", path, "does not exist." );
	      } // end else  
	   } // end method analyzePath
	
	
}

