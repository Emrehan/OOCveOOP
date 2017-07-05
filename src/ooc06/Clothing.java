package ooc06;

public class Clothing extends Item {
	private int minMonthLimit, maxMonthLimit;

	public Clothing(String barcode, String description, 
			int minMonthLimit, int maxMonthLimit ) {
		super(barcode, description);
		this.minMonthLimit = minMonthLimit;
		this.maxMonthLimit = maxMonthLimit;
	}

	public void kiyafet_fonk() {
		System.out.println("Bu bir kiyafet");
	}
	
	public boolean isSuitable(Child aChild) {
		if( aChild.getAgeInMonths() >= minMonthLimit 
				&& aChild.getAgeInMonths() <= maxMonthLimit )
			return true;
		return false;
	}
	

}
