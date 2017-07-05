package oop02b.ch20.fig20_16;// Fig. 20.16: SetTest.java
// HashSet used to remove duplicate values from array of strings.
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest
{
   public static void main( String[] args )
   {
      // create and display a List< String >
      String[] colors = { "red", "white", "blue", "green", "gray",
         "orange", "tan", "white", "cyan", "peach", "gray", "orange" };
      List< String > list = Arrays.asList( colors );
      System.out.printf( "List: %s\n", list );

      // eliminate duplicates then print the unique values
      printNonDuplicates( list );
   } // end main

   // create a Set from a Collection to eliminate duplicates
   private static void printNonDuplicates( Collection< String > values )
   {
      // create a HashSet
      Set< String > set = new HashSet< String >( values );

      System.out.print( "\nNonduplicates are: " );

      for ( String value : set )
         System.out.printf( "%s ", value );

      System.out.println();
   } // end method printNonDuplicates
} // end class SetTest

