package oop02a;

public class USIS {

	public static void main(String[] args) {
		Course oop = new Course("0112562", "Obj. Or. Prog.", 3);
		
		Student student1 = new Student("09011034","Student#1");
		if( !oop.addStudent(student1) )
			System.out.println("Problem #1");
		
		if( oop.addStudent(student1) )
			System.out.println("Problem #2");
		
		Student student2 = new Student("09011045","Student#2");
		oop.addStudent(student2);
		
		Student student3 = new Student("09011046","Student#3");
		oop.addStudent(student3);
		
		Student student4 = new Student("09011047","Student#4");
		if( oop.addStudent(student4) )
			System.out.println("Problem #3");

		if( oop.findStudent("09011046") != student3)
			System.out.println("Problem #4");
		
		oop.showClassList();
		
		System.out.println("End of test");
		
		
		
	}

}
