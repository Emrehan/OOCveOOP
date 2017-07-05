package oop08;
import javax.swing.*;
import java.awt.*;
//A component that displays a message.
@SuppressWarnings("serial")
public class NotHelloWorldPanel extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Not a Hello, World program", 60, 80);
	}
}
