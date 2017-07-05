package oop05b;
@SuppressWarnings("all")
public class Person {
	private String name;
	public Person( String name ) { this.name = name; }
	private class Employee { //begin inner class
		private int salary;
		public Employee( int salary ) { this.salary = salary;}
		public int getSalary() { return salary; }
		public void setSalary(int salary) { this.salary = salary; }
		public String toString( ) { return name + " " + salary; }
		//public static void birMetot() {}
		public class Manager {
			private int bonus;
			public Manager(int bonus) {
				this.bonus = bonus;
			}
			public int getSalary() {
				return salary + bonus;
			}
			public String toString() {
				return name + " " + getSalary();
			}
		}
	} //end inner class
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
		Employee.Manager mudur = staff[0].new Manager(1000);
		System.out.println(mudur);
	}
}
