package com.blobs.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.blobs.model.Ranking;

/**
 * Created by root on 08.06.16.
 */
public class JHighScorePanel extends JPanel {

    public JHighScorePanel() {
        // Set the frame characteristics
        setSize(300, 500);

        // Create a panel to hold all other components
        this.setLayout(null);
    }

    private String[][] handleData(List<Ranking> highscoreData) {
       String[][] arrayData = new String[highscoreData.size()][2];

        int i = 0;
        for (Ranking ranking : highscoreData) {
            arrayData[i][0] = ranking.getHighscore() + "";
            arrayData[i][1] = ranking.getName();

            i++;
        }

        return arrayData;
    }

    public void initTable(List<Ranking> highscoreData) {
         String[][] arrayData = handleData(highscoreData);

        // Create columns names
        String columnNames[] = { "HighScore", "Name"};

        // Create a new table instance
        JTable table = new JTable(arrayData, columnNames);
        table.setShowGrid(false);
        table.setBounds(200, 225, 700, 500);
        table.setRowHeight(30);
        table.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 30));
        table.setBackground(new Color(0, 0, 0, 0));

        this.add(table, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        try {
            g.drawImage(ImageIO.read(new File("img" + File.separator + "highscore.png")), 0, 0, null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
