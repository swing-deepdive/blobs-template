package com.blobs.view;

import com.blobs.model.Blob;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class View extends JFrame implements IView {
    private JBlobGrid jBlobGrid;

	public View() {
		this.setSize(900, 700);
		this.setResizable(false);

        // Create and set up grid
        jBlobGrid = new JBlobGrid(3, 3);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Initialize the grid with images etc.
        setBackground(new Color(44, 165, 124));

        // Display the window
        this.pack();
        this.setVisible(true);
	}

    @Override
    public void showSlot(Blob blob) {
        jBlobGrid.showSlot(blob);
    }

    @Override
    public void hideSlot(Blob blob) {
        jBlobGrid.hideSlot(blob);
    }

    @Override
    public void updateScore(int score) {

    }

    @Override
    public void gameOver() {

    }

    @Override
    public void gameStarted(Blob[] blobs) {
        jBlobGrid.init(this.getContentPane(), blobs);
    }

    @Override
    public void highscoreSubmitted(int score, String name) {

    }

    @Override
    public void showLeaderboards(Map<String, Integer> leaderboardMap) {

    }
}
