package oop00;

public class CallByReferenceExample {
	
	public static void main( String[] args ){
		Dog aDog = new Dog("Max");
		
		foo(aDog);

		if( aDog.getName().equals("Max") ){ //true
			System.out.println( "Java passes by value (call-by-value-of-reference)." );
		}else if( aDog.getName().equals("Fifi") ){
			System.out.println( "Java passes by reference (call-by-reference)." );
		}

		foo2(aDog);

		if( aDog.getName().equals("Fifi") ){ //true
			System.out.println( "By passing reference as value, Java allows access to object value." );
		}else if( aDog.getName().equals("Max") ){
			System.out.println( "By passing object-reference as value, Java does not allow access to object value." );
		}

	}

	public static void foo(Dog d) {
		d.getName().equals("Max"); // true
		d = new Dog("Fifi");
		d.getName().equals("Fifi"); // true
	}

	public static void foo2(Dog d) {
		d.getName().equals("Max"); // true
		d.setName("Fifi");
	}


}
