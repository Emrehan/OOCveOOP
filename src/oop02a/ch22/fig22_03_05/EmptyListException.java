// Fig. 22.4: EmptyListException.java
// Class EmptyListException declaration.
package oop02a.ch22.fig22_03_05;

public class EmptyListException extends RuntimeException 
{
   // no-argument constructor
   public EmptyListException()
   {
      this( "List" ); // call other EmptyListException constructor
   } // end EmptyListException no-argument constructor

   // one-argument constructor
   public EmptyListException( String name )
   {
      super( name + " is empty" ); // call superclass constructor
   } // end EmptyListException one-argument constructor
} // end class EmptyListException

