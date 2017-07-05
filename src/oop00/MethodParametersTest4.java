package oop00;

public class MethodParametersTest4 {


	public void regularAssignment( ) {
		int x = 10;
		Integer[] integerArray = new Integer[ 5 ]; // create integerArray
		//assign Integer 10 to integerArray[ 0 ]
		integerArray[ 0 ] = new Integer( x );
		//get int value of Integer
		int value = integerArray[ 0 ].intValue();
		System.out.println("regular way: value = " + value);
	}
	
	public void autoBoxing() {
		int x = 10;
		Integer[] integerArray = new Integer[ 5 ]; // create integerArray
		//autoboxing
		integerArray[ 0 ] = x; // assign Integer 10 to integerArray[ 0 ]
		//auto-unboxing
		int value = integerArray[ 0 ]; // get int value of Integer
		System.out.println("auto-boxing auto-unboxing: value = " + value);
	}	
	
    public static void main(String[] args) {
    	MethodParametersTest4 test = new MethodParametersTest4();
    	test.regularAssignment();
    	test.autoBoxing();
    }	
	
}





