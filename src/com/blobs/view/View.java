package com.blobs.view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame implements IView {

	public View() {
		this.setSize(900, 700);
		this.setResizable(false);

        // Create and set up grid
        JBlobGrid jBlobGrid = new JBlobGrid(3, 3);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Initialize the grid with images etc.
        jBlobGrid.init(this.getContentPane());

        setBackground(new Color(44, 165, 124));

        // Display the window
        this.pack();
        this.setVisible(true);
	}

    @Override
    public void showBlob(int index) {

    }

    @Override
    public void hideBlob(int index) {

    }

    @Override
    public void updateScore(int score) {

    }

    @Override
    public void gameOver() {

    }

    @Override
    public void gameStarted() {

    }

    @Override
    public void highscoreSubmitted(int score, String name) {

    }
}
