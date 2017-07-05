package oop08;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class SizedWindowWithIcon extends JFrame {
	public SizedWindowWithIcon( ) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2);
		setLocation(screenSize.width / 4, screenSize.height / 4);
		Image img = kit.getImage("icon.jpg");
		setIconImage(img);
		setTitle("A Sized Window With Icon");
	}
	public static void main(String[] args) {
		SizedWindowWithIcon window = new SizedWindowWithIcon( );
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
