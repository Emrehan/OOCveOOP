package ooc06;

public class Toy extends Item {
	private int minAgeLimit;

	public Toy(String barcode, String description, int minAgeLimit) {
		super(barcode, description);
		this.minAgeLimit = minAgeLimit;
	}

	public void oyuncak_fonk() {
		System.out.println("Bu bir oyuncak");
	}
	
	public boolean isSuitable(Child aChild) {
		if( aChild.getAgeInMonths()/12 >= minAgeLimit )
			return true;
		return false;
	}
	
}
