package oop04a.classexample;

public abstract class Pet implements Runnable, java.io.Serializable {

	private String name;

	public Pet(String name) { this.name = name;	}
	
	public String getName() { return name;	}
}

