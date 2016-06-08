package com.blobs;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;

public class Test {

    private static final String MEDIA_URL = "vid/prequel.mp4";

    private static void initFxLater(JFXPanel panel) {
        MediaPlayer mediaPlayer = null;
        try {
            mediaPlayer = new MediaPlayer(new Media(new File(MEDIA_URL).toURI().toURL().toString()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        mediaPlayer.setAutoPlay(true);

        MediaView mediaView = new MediaView(mediaPlayer);
        Pane mvPane = new Pane();
        mvPane.getChildren().add(mediaView);

        BorderPane pane = new BorderPane();

        mvPane.setMinSize(900, 700);
        mvPane.setPrefSize(900, 700);
        pane.setMinSize(900, 700);
        pane.setPrefSize(900, 700);

        pane.setCenter(mvPane);
        Scene scene = new Scene(pane);

        panel.setScene(scene);
    }

    private static void initSwingLater() {
        JFrame jFrame = new JFrame("- JFrame -");
        jFrame.setSize(900, 700);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setLayout(null);

        final JFXPanel jFXPanel = new JFXPanel();
        jFXPanel.setBounds(0, 0, 900, 700);

        JPanel playerpanel = new JPanel();
        playerpanel.add(jFXPanel);
        playerpanel.setBounds(0, 0, 900, 700);
        playerpanel.setBackground(new Color(255, 255, 0, 1));


        jFrame.getContentPane().add(playerpanel);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFxLater(jFXPanel);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initSwingLater();
            }
        });
    }
}