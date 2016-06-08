package com.blobs.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 08.06.16.
 */
public class JGamePanel extends JPanel {
    private JBlobGrid jBlobGrid;
    private JLabel score;

    public JGamePanel() {
        this.setLayout(new BorderLayout());
        jBlobGrid = new JBlobGrid(3, 3);
        setBackground(new Color(44, 165, 124));
        score = new JLabel("Score: --");
        score.setHorizontalAlignment(SwingConstants.CENTER);
        score.setVerticalAlignment(SwingConstants.BOTTOM);
        score.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 50));
        score.setForeground(Color.WHITE);
        score.setBorder(BorderFactory.createEmptyBorder( 0, 0, 25, 0 ));
        add(score);
    }

    public JBlobGrid getGrid() {
        return jBlobGrid;
    }

    public void updateScore(int score) {
        this.score.setText("Score: " + score);
    }
}
