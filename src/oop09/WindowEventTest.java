package oop09;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;

public class WindowEventTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		    public void run() {
			CaptureWindowEventsFrame frame = 
			new CaptureWindowEventsFrame();
		    	frame.setVisible(true);
		    }
		});
	}
}
//continues in the next slide.
class CaptureWindowEventsFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;  
	public CaptureWindowEventsFrame(){
		setTitle("CaptureWindowEventsTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		addWindowListener( new MyWindowListener( ) );
		addWindowStateListener( new MyWindowStateListener( ) );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//continues in the next slide.

class MyWindowListener implements WindowListener {
	public void windowOpened(WindowEvent e) { 
		System.out.println("Window has been opened");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("Window is to be closed");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("Window is closed"); //Bunu yazmadý!
	}
	public void windowActivated(WindowEvent e) {
		System.out.println("Window has gained focus");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window has lost the focus");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("Window is minimized");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window is de-minimized");
	}
}//continues in the next slide.
/**
 * Meaning of returns from WindowEvent.getOldState() 
 * and WindowEvent.getNewState() methods:
 * Frame.NORMAL (0), Frame.ICONIFIED (1) , 
 * Frame.MAXIMIZED_HORIZ (4), Frame.MAXIMIZED_VERT (2), 
 * Frame.MAXIMIZED_BOTH (6=4+2) 
 */
class MyWindowStateListener implements WindowStateListener {
	public void windowStateChanged( WindowEvent e ) {
		System.out.print( "Old state: " + e.getOldState() );
		System.out.println( ", New state: " + e.getNewState() );
	}
}
