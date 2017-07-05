package oop02a.ch20.fig20_02;
// Fig. 20.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListTest 
{
   public static void main( String[] args )
   {
      // add elements in colors array to list
      String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
      ArrayList< String > list = new ArrayList< String >();      

      for ( String color : colors )
         list.add( color ); // adds color to end of list      

      // add elements in removeColors array to removeList
      String[] removeColors = { "RED", "WHITE", "BLUE" };
      ArrayList< String > removeList = new ArrayList< String >();

      for ( String color : removeColors )
         removeList.add( color ); 

      // output list contents
      System.out.println( "ArrayList: " );

      for ( int count = 0; count < list.size(); count++ )
         System.out.printf( "%s ", list.get( count ) );

      // remove from list the colors contained in removeList
      removeColors( list, removeList );

      // output list contents
      System.out.println( "\n\nArrayList after calling removeColors: " );

      for ( String color : list )
         System.out.printf( "%s ", color );
   } // end main

   // remove colors specified in collection2 from collection1
   private static void removeColors( ArrayList< String > list1, 
		   ArrayList< String > list2 )
   {
      // get iterator
      Iterator< String > iterator = list1.iterator(); 

      // loop while collection has items
      while ( iterator.hasNext() )         
      {
         if ( list2.contains( iterator.next() ) )
            iterator.remove(); // remove current Color
      } // end while
   } // end method removeColors
} // end class CollectionTest

