package oop06c;
public class Account {
	private double balance;
	public Account(double balance) { this.balance = balance; }
	public double getBalance() { return balance; }
	//synchronized for shared data
	public synchronized void withdraw( double amt ){  
		double curBal = getBalance();
		possibleDelay( );
		balance = curBal - amt;
	}
	//synchronized for shared data
	public synchronized void deposit( double amt ){  
		double curBal = getBalance();
		possibleDelay( );
		balance = curBal + amt;
	}
	private void possibleDelay( ) {
		try { Thread.sleep(5); } 
		catch (InterruptedException e) { e.printStackTrace(); }
	}
}
