package ooc05;

public class MainProgram05 {

	public static void main(String[] args) {
		
		GalleryOwner halis = 
			new GalleryOwner("Halis Toprak");
		halis.setGalleryName("Toprak Oto");
		
		Car bmw = new Car("34 RA 440", halis);
		Car audi = new Car("06 AC 432", halis);
		
		if( halis.addCar(bmw) ) {
			System.out.println("Islem basarili");
		}
		else {
			System.out.println("Islem basarisiz");
		}
		
		halis.addCar(audi);
		
		System.out.println(halis);
		System.out.println(bmw.introduceSelf());
		
		if( halis.searchCar(audi) == true ) {
			System.out.println(audi.getPlate() + " aramada bulundu!");
		}
		else
			System.out.println(audi.getPlate() + " aramada bulunamadi!");
		
		boolean result1 = halis.sellCar(bmw);
		System.out.println("satis-1 sonucu! " + result1);
		boolean result2 = halis.sellCar(bmw);
		System.out.println("satis-2 sonucu! " + result2);

		if( halis.searchCar(bmw) == true ) 
			System.out.println(bmw.getPlate() + " satisin ardindan aramada bulundu!");
		else
			System.out.println(bmw.getPlate() + " satisin ardindan aramada bulunmadi!");

	}

}
