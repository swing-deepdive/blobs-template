package com.blobs.view;

import javax.swing.*;

public class View extends JFrame implements IView {

	public View() {
		this.setSize(900, 700);
		this.setResizable(false);

        // Create and set up grid
        JBlobGrid jBlobGrid = new JBlobGrid(3, 3);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Initialize the grid with images etc.
        jBlobGrid.init(this.getContentPane());

        // Display the window
        this.pack();
        this.setVisible(true);
	}
}
