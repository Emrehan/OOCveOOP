package oop01;

public class Kisi {
	private String isim;
	private int yas;

	public Kisi( String name ) { this.isim = name; }

	public String getIsim( ) { return isim; }

	public int getYas( ) { return yas; }

	public String toString() {
		return getIsim() + " " + getYas( );
	}

	public void setYas( int yas ) throws OlanaksizBilgi {
		if( yas < 0 || yas > 150 )
			throw new OlanaksizBilgi( "Hatalý yaþ: " + 
					yas );
		this.yas = yas;
	}

}
