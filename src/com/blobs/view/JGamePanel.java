package com.blobs.view;

import com.blobs.model.Blob;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 08.06.16.
 */
public class JGamePanel extends JPanel {
    private JGameGrid gameGrid;
    private JLabel score;

    public JGamePanel() {
        this.setLayout(new BorderLayout());
        this.gameGrid = new JGameGrid(3, 3);
        this.setBackground(new Color(44, 165, 124));

        setupScoreField();
    }

    public void initUI(Blob[] blobs) {
        this.add(gameGrid.init(blobs), BorderLayout.NORTH);
    }

    private void setupScoreField() {
        score = new JLabel("Score: --");
        score.setHorizontalAlignment(SwingConstants.CENTER);
        score.setVerticalAlignment(SwingConstants.BOTTOM);
        score.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 50));
        score.setForeground(Color.WHITE);
        score.setBorder(BorderFactory.createEmptyBorder( 0, 0, 25, 0 ));
        this.add(score);
    }

    public JGameGrid getGrid() {
        return gameGrid;
    }

    public void updateScore(int score) {
        this.score.setText("Score: " + score);
    }
}
