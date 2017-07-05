package oop02a;

import oop02a.Course;
import oop02a.Student;

public class Test {

	public static void main(String[] args) {
		boolean basari = true;
		Course ders = new Course( "0112562", "Object Oriented Programming", 3 );
		
		ders.addStudent( new Student("09011022", "Student#1") );
		ders.addStudent( new Student("09011035", "Student#2") );
		
		if( ders.getStudentCount() == 2 ) {
			System.out.println("Test 1 successful!");
		}
		else {
			System.out.println("Test 1 unsuccessful!");
			basari = false;
		}
		Student student3 = new Student("09011043", "Student#3");
		ders.addStudent(student3);
		if( ders.findStudent("09011043") == student3 ) {
			System.out.println("Test 2 successful!");
		}
		else {
			System.out.println("Test 2 unsuccessful!");
			basari = false;
		}
		ders.increaseCapacity(2);
		if( ders.getCapacity() == 2 ) {
			System.out.println("Test 3 unsuccessful!");
			basari = false;
		}
		else {
			System.out.println("Test 3 successful!");
		}
		Student ogr = ders.findStudent(student3.getNumber());
		if( ogr != null ) {
			System.out.println("Test 4 successful!");
		}
		else {
			System.out.println("Test 4 unsuccessful!");
			basari = false;
		}
		ders.increaseCapacity(20);
		ogr = ders.findStudent("00000000");
		if( ogr == null ) {
			System.out.println("Test 4 successful!");
		}
		else {
			System.out.println("Test 4 unsuccessful!");
			basari = false;
		}
		ders.showClassList();
		if( basari )
			System.out.println("All tests are successful!");
		else
			System.out.println("At least on test is unsuccessful!");

	}

}
