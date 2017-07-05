package oop08;
import javax.swing.*;
@SuppressWarnings("serial")
public class SimpleWindow extends JFrame {
	public static final int DEFAULT_WIDTH = 300; 
	public static final int DEFAULT_HEIGHT = 200; 
	public SimpleWindow( ) {
		setSize( DEFAULT_WIDTH, DEFAULT_HEIGHT ); 
	}
	public static void main(String[] args) {
		SimpleWindow window = new SimpleWindow( );
		window.setTitle("A Simple Window");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
