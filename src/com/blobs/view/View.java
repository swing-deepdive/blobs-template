package com.blobs.view;

import com.blobs.controller.IController;
import com.blobs.model.Blob;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class View extends JFrame implements IView {
    private JGamePanel gamePanel;
    private IController controller;

	public View() {
		this.setSize(900, 700);
		this.setResizable(false);

        // Create and set up grid
        gamePanel = new JGamePanel();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Initialize the grid with images etc.
        getContentPane().setBackground(new Color(44, 165, 124));
        setBackground(new Color(44, 165, 124));
        add(gamePanel);
        // Display the window
        this.setVisible(true);
	}

    @Override
    public void setController(IController controller) {
        this.controller = controller;
    }

    @Override
    public void showSlot(Blob blob) {
        this.gamePanel.getGrid().showSlot(blob);
    }

    @Override
    public void hideSlot(Blob blob) {
        this.gamePanel.getGrid().hideSlot(blob);
    }

    @Override
    public void updateScore(int score) {
        this.gamePanel.updateScore(score);
    }

    @Override
    public void gameOver() {

    }

    @Override
    public void gameStarted(Blob[] blobs) {
        this.gamePanel.getGrid().init(gamePanel, blobs);
    }

    @Override
    public void highscoreSubmitted(int score, String name) {

    }

    @Override
    public void run() {
        this.controller.startGame();
    }

    @Override
    public void showLeaderboards(Map<String, Integer> leaderboardMap) {

    }
}
