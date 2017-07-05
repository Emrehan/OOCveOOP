package ooc06;

public class Main {

	public static void main(String[] args) {
		Child ahmet = new Child("Ahmet Küçük",5); //5 aylik
		
		Toy lego = new Toy("123456","Lego Star Wars",4); //4 yas
		lego.getBarcode();
		
		Clothing pinny = new Clothing("86978945","Mama Onlugu",0,24); //0-24 ay
		
		if( lego.isSuitable(ahmet) )
			System.out.println("Lego Star Wars oyunu Ahmet icin uygun!");
		else
			System.out.println("Lego Star Wars oyunu Ahmet icin uygun degil!");
		
		if( pinny.isSuitable(ahmet) )
			System.out.println("Mama Onlugu Ahmet icin uygun!");
		else
			System.out.println("Mama Onlugu Ahmet icin uygun degil!");
	
	Toy a = new Toy("", "", 0);
	Toy b = new Toy("", "", 0);
	
	if ( a.getBarcode().compareTo(b.getBarcode()) == 0 ) {
		System.out.println( "Eþit => compareTo" );
	}
	
	if ( !a.equals(b) )  {
		System.out.println( "Eþit => equals" );
	}
			
	
	}

	
	
}
