package oop05a;

public class Test {

	public static void main(String[] args) {
		Tariff tariff4 = Tariff.NET4;
		Person instructor = new Person("Instructor");
		instructor.subscribeTo(tariff4);
		tariff4.setFee(35);
		Person student = new Person("Student");
		student.subscribeTo(Tariff.NET4);
		Tariff.NETFREE.setFee(65);
		System.out.println(instructor);
		System.out.println(student);
	}

}
