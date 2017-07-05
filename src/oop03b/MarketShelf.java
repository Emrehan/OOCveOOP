package oop03b;

import java.util.*;

public class MarketShelf {
	private LinkedList<Item> items;
	
	public MarketShelf() {
		items = new LinkedList<Item>();
	}
	
	public boolean doesExist( Item anItem ) {
		for( Item item : items )
			if( item == anItem )
				return true;
		return false;
	}
	
	public boolean addItem( Item anItem ) {
		if( doesExist(anItem) )
			return false;
		items.add(anItem);
		return true;
	}

	public void checkForExpiration( ) {
		boolean hasExpiredItem = false;
		System.out.println("Expired item(s): ");
		for( Item item : items ) {
		    if( item instanceof Food )
		    	if( ((Food)item).isExpired() ) {
		    		hasExpiredItem = true;
		    		System.out.println(item);
		    	}
		}
		if( hasExpiredItem == false )
		    System.out.println("All items are fresh!");
	}
	
	public static void main( String[] args ) {
		MarketShelf fridge = new MarketShelf();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH,17);
		Date future = cal.getTime();
		System.out.println(future);
		cal.set(Calendar.YEAR, 2010);
		cal.set(Calendar.MONTH, 0); 	//0: January
		cal.set(Calendar.DATE, 12);
		Date past = cal.getTime();
		fridge.addItem( new Food(past) );
		fridge.addItem( new Food(future) );
		fridge.addItem( new Electronics() );
		fridge.checkForExpiration();
	}

}
