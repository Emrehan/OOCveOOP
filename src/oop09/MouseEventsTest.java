package oop09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventsTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		    public void run() {
			CaptureMouseEventsFrame frame = new CaptureMouseEventsFrame();
			frame.setVisible(true);
		    }
		});
	}
}
@SuppressWarnings("serial")
class CaptureMouseEventsFrame extends JFrame {
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	public CaptureMouseEventsFrame(){
		setTitle("CaptureMouseEventsTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		addMouseListener( new MouseHandler() );
		addMouseMotionListener( new MouseMotionHandler() );
	}
}
class MouseMotionHandler implements MouseMotionListener {
	public void mouseDragged(MouseEvent event) {
		double x,y;
		x = event.getPoint().getX();
		y = event.getPoint().getY();
		System.out.println("A mouse drag at ("+x+","+y+")");
	}
	public void mouseMoved(MouseEvent event) {
		double x,y;
		x = event.getPoint().getX();
		y = event.getPoint().getY();
		System.out.println("A mouse move at ("+x+","+y+")");
	}
}
class MouseHandler extends MouseAdapter {
	public void mouseClicked(MouseEvent event) {
		double x,y;int z, e;
		x = event.getPoint().getX(); y = event.getPoint().getY();
		z = event.getClickCount(); e = event.getModifiersEx();
		System.out.println("A mouse click at ("+x+","+y+")x"+z);
		if( ( e & InputEvent.BUTTON1_DOWN_MASK) != 0 )
			System.out.println("This was a left-click.");
		if( (e & InputEvent.BUTTON3_DOWN_MASK) != 0 )
			System.out.println("This was a right-click.");
		if( (e & InputEvent.BUTTON2_DOWN_MASK) != 0 )
			System.out.println("This was a middle-click.");
		if( (e & InputEvent.SHIFT_DOWN_MASK) != 0 )
			System.out.println("The shift key was also pressed");
		if( (e & InputEvent.CTRL_DOWN_MASK) != 0 )
			System.out.println("The control key was also pressed");
		if( (e & InputEvent.ALT_DOWN_MASK) != 0 )
			System.out.println("The alt key was also pressed.");
		if( (e & InputEvent.ALT_GRAPH_DOWN_MASK) != 0 )
			System.out.println("The altgr key was also pressed.");
		if( (e & InputEvent.META_DOWN_MASK) != 0 )
			System.out.println("The meta key was also pressed.");
		System.out.println("Summary of mods in click: " + 		InputEvent.getModifiersExText(e));
	}
}
