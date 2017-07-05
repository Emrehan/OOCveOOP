package oop09;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class KeyboardEventTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		    public void run() {
		    	CaptureKeyboardEventsFrame frame = new CaptureKeyboardEventsFrame();
			frame.setVisible(true);
		    }
		});
	}
}
@SuppressWarnings("serial")
class CaptureKeyboardEventsFrame extends JFrame {
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	public CaptureKeyboardEventsFrame(){
		setTitle("CaptureKeyboardEventsTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		addKeyListener(new SpecialKeyHandler() );
		addKeyListener(new KeyHandler() );
	}
}
class KeyHandler implements KeyListener {
	int lastKey; char lastChar; static String keyText;
	public void keyPressed(KeyEvent event) {  
		int keyCode = event.getKeyCode();
		if( keyCode != lastKey) {
			System.out.print( "Key pressed, code: " + keyCode );
			lastKey = keyCode;
		}
	}
	public void keyReleased(KeyEvent event) {
		int keyCode = event.getKeyCode();
		System.out.println( "\nKey released, logical code: " + 		KeyEvent.getKeyText(keyCode) );
	}
	public void keyTyped(KeyEvent event) {  
		char keyChar = event.getKeyChar();
		if( keyChar != lastChar ) {
			System.out.print( "\nKey typed: " + keyChar );
			lastChar = keyChar;
		}
		else
			System.out.print( keyChar );
	}
}
class SpecialKeyHandler extends KeyAdapter {
	public void keyTyped(KeyEvent event) {
		if( event.isShiftDown() )
			System.out.print("***Shift key is used***");
		if( event.isControlDown() )
			System.out.print("***Control key is used***");
		if( event.isAltDown() )
			System.out.print("***Alt key is used***");
		if( event.isAltGraphDown() )
			System.out.print("***AltGR key is used***");
		if( event.isMetaDown() )
			System.out.print("***Meta key is used***");
	}
} 
