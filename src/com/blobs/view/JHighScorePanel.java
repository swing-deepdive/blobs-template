package com.blobs.view;

import com.blobs.model.Ranking;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

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

    private String[][] handleData(Set<Ranking> highscoreData) {
       String[][] arrayData = new String[highscoreData.size()][2];

        int i = 0;
        for (Ranking ranking : highscoreData) {
            arrayData[i][0] = ranking.getHighscore() + "";
            arrayData[i][1] = ranking.getName();

            i++;
        }

        return arrayData;
    }

    public void initTable(Set<Ranking> highscoreData) {
         //String[][] arrayData = handleData(highscoreData);
        String arrayData[][] =
                {
                        { "12", "Julian"},
                        { "-123", "43"},
                        { "93", "89.2"},
                        { "279", "9033"}
                };
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
