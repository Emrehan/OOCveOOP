package ooc06;

public abstract class Item { 
	private String barcode, description;
	

	public Item(String barcode, String description) {
		this.barcode = barcode;
		this.description = description;
	}
	
	public String getBarcode() {
		return barcode;
	}
	
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract boolean isSuitable(Child aChild);


}
