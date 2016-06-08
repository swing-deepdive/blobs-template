package com.blobs.view;

import com.blobs.Constants;
import com.blobs.controller.IController;
import com.blobs.model.Blob;
import com.blobs.util.AudioPlayer;
import com.sun.java.swing.plaf.gtk.GTKConstants;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.*;

public class View extends JFrame implements IView {
	private JGamePanel gamePanel;
	private JStartPanel startPanel;
	private IController controller;

	public View() {
		this.setSize(900, 700);
		this.setResizable(false);

		// Create and set up grid
		startPanel = new JStartPanel();

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		getContentPane().setBackground(new Color(44, 165, 124));
		setBackground(new Color(44, 165, 124));
		add(startPanel);

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
		JGameOverPanel gameOverPanel = new JGameOverPanel();
		this.remove(this.gamePanel);
		this.revalidate();
		this.repaint();
		gameOverPanel.setBounds(0, 0, 900, 700);
		this.gamePanel = null;
		this.add(gameOverPanel);
	}

	@Override
	public void gameStarted(Blob[] blobs) {
		this.gamePanel = new JGamePanel();
		remove(this.startPanel);
		this.startPanel = null;
		add(this.gamePanel);
		this.gamePanel.initUI(blobs);
	}

	@Override
	public void highscoreSubmitted(int score, String name) {

	}

	@Override
	public void run() {
		startPanel.startAnimation();
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.playSound("audio" + File.separator + "theme.mp3", MediaPlayer.INDEFINITE);
	}

	@Override
	public void showLeaderboards(Map<String, Integer> leaderboardMap) {

	}
}
