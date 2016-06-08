package com.blobs.view;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.*;

import com.blobs.MVC;

import java.awt.Color;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.MalformedURLException;

public class JStartPanel extends JComponent implements MouseListener{
    private static final String MEDIA_URL = "vid" + File.separator + "prequel.mp4";

	public JStartPanel() {
		JComponent button = new JPanel();
		button.setBounds(220, 275, 450, 140);
		button.setBackground(new Color(0,0,0,0));
		button.addMouseListener(this);
		this.add(button);
	}

    public void startAnimation() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initSwingLater();
            }
        });
    }

	private void initFxLater(JFXPanel panel) {
		MediaPlayer mediaPlayer = null;
		try {
			mediaPlayer = new MediaPlayer(new Media(new File(MEDIA_URL).toURI().toURL().toString()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

		MediaView mediaView = new MediaView(mediaPlayer);
		Pane mvPane = new Pane();
		mvPane.getChildren().add(mediaView);
		mvPane.setMinSize(900, 700);
		mvPane.setPrefSize(900, 700);
		panel.setScene(new Scene(mvPane));
	}

	private void initSwingLater() {
		final JFXPanel jFXPanel = new JFXPanel();
		jFXPanel.setBounds(0, 0, 900, 700);
		jFXPanel.setAlignmentY(0);

		this.add(jFXPanel);

		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				initFxLater(jFXPanel);
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		MVC.getController().startGame();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
