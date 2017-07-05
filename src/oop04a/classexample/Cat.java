package oop04a.classexample;

public class Cat extends Pet {
	
	public Cat(String name) {	super(name);	}
	
	public void run() {
		System.out.println("(" + getName() + "): Meaow!");
	}
}

