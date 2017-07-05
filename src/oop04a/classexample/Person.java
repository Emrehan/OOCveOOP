package oop04a.classexample;

import java.util.*; 
import java.io.*;

public class Person {
	
	private String name;
	private LinkedList<Pet> pets;
	
	public Person(String name) {
		this.name = name;
		pets = new LinkedList<Pet>();
	}
	
	public Pet searchPet( String petName ) {
		for( Pet pet : pets )
			if( pet.getName().equalsIgnoreCase(petName) )
				return pet;
		return null;
	}
	
	public boolean searchPet( Pet aPet ) {
		for( Pet pet : pets )
			if( pet == aPet )
		 		return true;
		return false;
	}
	
	public void addPet( Pet aPet ) throws DuplicateInformation {
		if( searchPet(aPet) == true )
			throw new DuplicateInformation("Pet already exists!");
		if( searchPet(aPet.getName() ) != null )
			throw new DuplicateInformation("Pet with the name " +
					aPet.getName() + "already exists!");
		pets.add(aPet); //no else is necessary. See Main.
	}
	
	public String getName() { return name; }
	
	public void savePets( ) {

		try {
			ObjectOutputStream stream = new ObjectOutputStream( 
					new FileOutputStream(name+"sPets.dat") );
			stream.writeObject(pets);
			stream.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public LinkedList<Pet> loadPets( ) {

		try {
			ObjectInputStream stream = new ObjectInputStream( 
					new FileInputStream(name+"sPets.dat") );
			pets = (LinkedList<Pet>) stream.readObject( );
			stream.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return pets;
	}
}

