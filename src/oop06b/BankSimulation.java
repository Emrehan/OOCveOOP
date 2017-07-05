package oop06b;
import java.util.concurrent.*;
public class BankSimulation {
	
	public static void main(String[] args) {
		Account anAccount = new Account(0);
		System.out.println("Before: "+anAccount.getBalance());
		
		//executor regular class
		ExecutorService executor = Executors.newCachedThreadPool( );
		
		for( int i = 0; i < 100; i++ ) {
		    AccountDepositer task=new AccountDepositer(anAccount,1);
			//executor method
		    executor.execute(task);
		}
		
		for( int i = 0; i < 50; i++ ) {
		    AccountWithdrawer task=new AccountWithdrawer(anAccount,1);
			//executor method
		    executor.execute(task);

		}
		//executor method		
		executor.shutdown();
		//executor method		
		while( !executor.isTerminated() );
			System.out.println("After: "+anAccount.getBalance());
	}
}
