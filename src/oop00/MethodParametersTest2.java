package oop00;

public class MethodParametersTest2 {
	public void tryMe( ) {
		
		int x = 1, y = 2;
		System.out.println("Before : " + x + ", " + y );
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("After: " + x + ", " + y );
		
		Integer sarma1 = new Integer( 3 );
		Integer sarma2 = new Integer( 5 );
		System.out.println("Before : " + sarma1 + ", " + sarma2 );
		Integer gecici = sarma1;
		sarma1 = sarma2;
		sarma2 = gecici;
		System.out.println("After: " + sarma1 + ", " + sarma2 );
	}
    public static void main(String[] args) {
    	MethodParametersTest2 test = new MethodParametersTest2();
    	test.tryMe();
    }


}
