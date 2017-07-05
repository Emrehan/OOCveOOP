package oop09;

import java.awt.event.*;

public class MyWindowAdapter extends WindowAdapter {
	public void windowActivated(WindowEvent e) {
		System.out.println("Window has gained focus");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window has lost the focus");
	}
}
