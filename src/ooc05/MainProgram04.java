package ooc05;

public class MainProgram04 {

	public static void main(String[] args) {
		Person oktay = new Person("Oktay Sinanoglu");
		Car rover = new Car("06 OS 1934", oktay);
		//oktay.setCar(rover);
		//rover.setOwner(oktay);
		System.out.println( oktay.introduceSelf() );
		System.out.println( rover.introduceSelf() );

		Person serkan = new Person("Serkan Anilir");
		Car honda = new Car("34 JAXA 73");
		//serkan.setCar(honda);
		honda.setOwner(serkan);
		System.out.println( serkan.introduceSelf() );
		System.out.println( honda.introduceSelf() );
	}

}
