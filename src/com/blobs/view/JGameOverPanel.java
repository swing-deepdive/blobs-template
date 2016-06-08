package com.blobs.view;

import javax.swing.*;

import com.blobs.Constants;

import java.awt.*;

/**
 * Created by root on 08.06.16.
 */
public class JGameOverPanel extends JComponent {
	private JLabel name;
	private JTextField textField = new JTextField(20);
	private JLabel gameOver;

	public JGameOverPanel() {
		this.setBackground(new Color(255, 255, 0));
		this.setBounds(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
	}

	private void setupNameField() {
		name = new JLabel("Name: ");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setVerticalAlignment(SwingConstants.BOTTOM);
		name.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 50));
		name.setForeground(Color.WHITE);
		name.setBorder(BorderFactory.createEmptyBorder(0, 0, 25, 0));
		this.add(name);
	}

	private void setupGameOverField() {
		gameOver = new JLabel("Game Over");
		gameOver.setHorizontalAlignment(SwingConstants.CENTER);
		gameOver.setVerticalAlignment(SwingConstants.BOTTOM);
		gameOver.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 50));
		gameOver.setForeground(Color.WHITE);
		gameOver.setBorder(BorderFactory.createEmptyBorder(0, 0, 25, 0));
		gameOver.setBounds(0, 0, 300, 400);
		this.add(gameOver);
	}

	public void setupUI() {
		setupNameField();
		setupGameOverField();
		this.revalidate();
		this.repaint();

	}
}
