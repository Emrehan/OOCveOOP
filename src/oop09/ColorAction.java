package oop09;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorAction implements ActionListener {
	private Color backgroundColor;
	private JPanel buttonPanel;
	public ColorAction(Color c, JPanel buttonPanel){ 
		backgroundColor = c; 
		this.buttonPanel=buttonPanel;
		}
	public void actionPerformed(ActionEvent event){
		buttonPanel.setBackground(backgroundColor);
	}
}
