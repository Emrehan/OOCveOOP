package oop06a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Match {
	public static void main(String[] args) {
		Thread aThread;
		ExecutorService pool = Executors.newCachedThreadPool( ); 
		
		aThread=new SoccerFan("G.S.","4 yildiz");
		aThread.setPriority(Thread.MAX_PRIORITY);
		pool.execute(aThread);
		
		aThread = new Thread( new SoccerFan("G.S.", "Rulez!") );
		aThread.setPriority(Thread.MAX_PRIORITY);
		pool.execute(aThread);
		
		aThread = new Thread( new SoccerFan("G.S.", "is the champ!") );
		aThread.setPriority(Thread.MAX_PRIORITY);
		pool.execute(aThread);
		aThread = new Thread( new SoccerFan("F.B.", "is no.1!") );
		aThread.setPriority(Thread.MIN_PRIORITY);
		pool.execute(aThread);
		aThread = new Thread( new SoccerFan("F.B.", "is the best!") );
		aThread.setPriority(Thread.MIN_PRIORITY);
		pool.execute(aThread);
		pool.shutdown();

	}

}
