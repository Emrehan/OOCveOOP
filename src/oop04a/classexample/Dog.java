package oop04a.classexample;

public class Dog extends Pet {
	
	public Dog(String name) {	super(name);	}
	
	public void run() {
		System.out.println("(" + getName() + "): Bark!");
	}
}
