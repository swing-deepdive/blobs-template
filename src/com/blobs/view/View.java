package com.blobs.view;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class View extends JFrame implements IView {
    private JBlobGrid jBlobGrid;

	public View() {
		this.setSize(900, 700);
		this.setResizable(false);

        // Create and set up grid
        jBlobGrid = new JBlobGrid(3, 3);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Initialize the grid with images etc.
        jBlobGrid.init(this.getContentPane());

        setBackground(new Color(44, 165, 124));

        // Display the window
        this.pack();
        this.setVisible(true);
	}

    @Override
    public void showSlot(int index) {
        jBlobGrid.showSlot(index);
    }

    @Override
    public void hideSlot(int index) {
        jBlobGrid.hideSlot(index);
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

    @Override
    public void showLeaderboards(Map<String, Integer> leaderboardMap) {

    }
}
