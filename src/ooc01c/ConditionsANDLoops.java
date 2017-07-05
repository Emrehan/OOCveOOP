package ooc01c;

import java.util.Scanner;

public class ConditionsANDLoops {
	  
	public static void main( String args[] ) {
		   Scanner in = new Scanner(System.in);
		   System.out.print("Enter a value? ");
		   int input = in.nextInt();   

            String numbers = null;
	        if (input >= 0 && input <2) {
	            numbers = "0-2";
	        } else if (input == 2) {
	            numbers = "2";
	        } else if (input <= 4) {
	            numbers = "3-4";
	        } else {
	            numbers = "4 < ...";
	        }
	        System.out.println("numbers = " + numbers);
		   
		   
		   //////////////////////////////////		    
		    for (int i = 0; i < input; i++) {
	            System.out.println("for loop " + i);
		    }

		    //////////////////////////////////		    
		    int count = 0;
		    while (count < input) {
		            System.out.println("while loop " + count);
		            count++;
		    }
		    
		    //////////////////////////////////
		    count = 0;
	        do {
		            System.out.println("do - while loop " + count);
		            count++;
	        } while (count < input);
		    
		    //////////////////////////////////	
		    switch (input) {
		        case 0:
		            System.out.println("switch case " + input);
		            break;
		        case 1:
		            System.out.println("switch case " + input);
		            break;
		        default:
		            System.out.println("switch default " + input);
		            break;
		    }	        
	        in.close();
		   }
}
