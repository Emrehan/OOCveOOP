package ooc03;

public class MainProgram03 {

	public static void main(String[] args) {
		
		Person oktay = new Person("Oktay Sinanoglu");
		Car rover = new Car("06 OS 1934");
		oktay.setCar(rover);
		rover.setOwner(oktay);
		System.out.println( oktay.introduceSelf() );
		System.out.println( rover.toString());

		Person serkan = new Person("Serkan Anilir");
		Car honda = new Car("34 JAXA 73",serkan);
		serkan.setCar(honda);
		System.out.println( serkan.introduceSelf() );
		System.out.println( honda.toString());
		/* 
		 
		
		Person oktay = new Person("Oktay Sinanoglu");
		Car rover = new Car("06 OS 1934");
		oktay.setCar(rover);
		
		Person serkan = new Person("Serkan Anilir");
		serkan.setCar(rover);
		rover.setOwner(serkan);		
		
		System.out.println( oktay.introduceSelf() );
		System.out.println( serkan.introduceSelf() );
		System.out.println( rover );
		*/
	}

}
