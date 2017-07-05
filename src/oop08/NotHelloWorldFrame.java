package oop08;
import javax.swing.*;

@SuppressWarnings("serial")
public class NotHelloWorldFrame extends JFrame {
	public NotHelloWorldFrame(){
		setTitle("NotHelloWorld");
		setSize(300, 200);
		NotHelloWorldPanel panel = new NotHelloWorldPanel();
		add(panel);
	}
}
