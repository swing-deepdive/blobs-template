package com.blobs.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class View extends JFrame implements IView {
	
	public View() {
		JLabel jlbHelloWorld = new JLabel("Score: 1240");
		jlbHelloWorld.setVerticalAlignment(SwingConstants.TOP);
		jlbHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
		add(jlbHelloWorld);
		this.setSize(900, 700);
		setVisible(true);
	}
}
