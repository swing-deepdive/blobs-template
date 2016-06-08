package com.blobs.view;

import com.blobs.controller.IController;
import com.blobs.model.Blob;
import com.blobs.model.Ranking;
import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * The view implements {@link IView} and houses the implementation found there. It extends JFrame
 * because it is the "window" of the application. From here all states of the view should be managed.
 */
public class View extends JFrame implements IView {
	private JStartPanel startPanel;
    private JHighScorePanel highScorePanel;

    /**
     * Creates a new instance of the View.
     */
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
	public void addBlob(Blob blob) {
	}

	@Override
	public void removeBlob(Blob blob) {
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
	public void startProgram() {
	}

	@Override
	public void showLeaderboards(List<Ranking> leaderboard) {
        highScorePanel = new JHighScorePanel();
        highScorePanel.initTable(leaderboard);
        highScorePanel.setBounds(0, 0, 900, 700);
        this.add(highScorePanel);
        this.revalidate();
        this.repaint();
	}
}
