package oop09;

import java.awt.*;
import javax.swing.*;

public class ButtonTestV2 {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ButtonFrameV2 frame = new ButtonFrameV2();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class ButtonFrameV2 extends JFrame {
	private JPanel buttonPanel;
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;

	public ButtonFrameV2() {
		setTitle("ButtonTestV2");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// create buttons
		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");

		buttonPanel = new JPanel();

		// add buttons to panel
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);

		//continues in the next slide
		//continued from the next slide
		// add panel to frame
		add(buttonPanel);

		// create button actions (listeners)
		ColorAction yellowAction = new ColorAction(Color.YELLOW, buttonPanel);
		ColorAction blueAction = new ColorAction(Color.BLUE, buttonPanel);
		ColorAction redAction = new ColorAction(Color.RED, buttonPanel);

		// associate actions with buttons
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	} //end of ButtonFrame constructor.

	//An action listener that sets the panel's background color.
}
