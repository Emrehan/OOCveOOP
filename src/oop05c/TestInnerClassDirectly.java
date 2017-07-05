package oop05c;

//this import is absolutely necessary
import oop05c.Person.Employee;

public class TestInnerClassDirectly {
	public static void main( String[] args ) {
		Employee[] staff = new Employee[3];
		Person kisi;
		kisi = new Person("Person1");
		staff[0] = kisi.new Employee( 10000 );
		kisi = new Person("Person2");
		staff[1] = kisi.new Employee( 7500 );
		kisi = new Person("Person3");
		staff[2] = kisi.new Employee( 6000 );
		for( Employee eleman: staff ) 
			System.out.println( eleman );
	}
}
