package oop05d;
public class TestInnerClassViaOuterClass {
	public static void main(String[] args) {
		Person[] staff = new Person[3];
		staff[0] = new Person( "Person1" );
		staff[0].enlist( 10000 );
		staff[1] = new Person( "Person2" );
		staff[1].enlist( 7000 );
		staff[2] = new Person( "Person3" );
		staff[2].enlist( 5000 );
		for( Person insan: staff )
			System.out.println( insan );
	}
}
