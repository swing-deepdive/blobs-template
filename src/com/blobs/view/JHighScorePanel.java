package com.blobs.view;

import com.blobs.model.Ranking;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
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
        setSize( 300, 200 );
        setBackground(Color.gray);

        // Create a panel to hold all other components
        this.setLayout(null);

        // Create some data
        String dataValues[][] =
                {
                        { "12", "Julian"},
                        { "-123", "43"},
                        { "93", "89.2"},
                        { "279", "9033"}
                };
        initTable(null);
    }

    private String[][] handleData(Set<Ranking> highscoreData) {
       String[][] arrayData = new String[highscoreData.size()][highscoreData.size()];

        for (Ranking ranking : highscoreData) {

        }
    }

    private void initTable(Map<String, Integer> highscoreData) {
         String[][] sortedData

        // Create columns names
        String columnNames[] = { "HighScore", "Name"};

        // Create a new table instance
        JTable table = new JTable(sortedData, columnNames);
        RowSorter <TableModel> rsorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rsorter);
        table.setBounds(100, 100, 700, 500);
        table.setRowHeight(30);
        //table.setBorder(BorderFactory.createEmptyBorder(100, 100, 300, 300));
        table.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 30));
        table.setBackground(new Color(0, 0, 0, 0));

        this.add(table, BorderLayout.CENTER);
    }

}
