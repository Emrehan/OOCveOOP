package oop02a.ch22.fig22_03_05;
// Fig. 22.5: ListTest.java
// ListTest class to demonstrate List capabilities.


public class ListTest 
{
   public static void main( String[] args )
   {
      List< Integer > list = new List< Integer >(); // create a List

      // insert integers in list
      list.insertAtFront( -1 );
      list.print();
      list.insertAtFront( 0 );
      list.print();
      list.insertAtBack( 1 );
      list.print();
      list.insertAtBack( 5 );
      list.print();

      // remove objects from list; print after each removal
      try 
      { 
         int removedItem = list.removeFromFront();
         System.out.printf( "\n%d removed\n", removedItem );
         list.print();

         removedItem = list.removeFromFront();
         System.out.printf( "\n%d removed\n", removedItem );
         list.print();

         removedItem = list.removeFromBack();
         System.out.printf( "\n%d removed\n", removedItem );
         list.print();

         removedItem = list.removeFromBack();
         System.out.printf( "\n%d removed\n", removedItem );
         list.print();
      } // end try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class ListTest

