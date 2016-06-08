package com.blobs;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * The main class.
 */
public class Main {

    /**
     * The main method, it launches the app.
     *
     * @param args Some command line args.
     */
	public static void main(String[] args) {
        Main main = new Main();
        main.loadFonts();
		MVC.launch();
	}

    /**
     * Loads a bunch of damn cool custom fonts (actually it's only 1).
     */
    private void loadFonts() {
        try {
            GraphicsEnvironment ge =
                    GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts" + File.separator +
                    "PixelSplitter-Bold.ttf")));
        } catch (IOException |FontFormatException e) {
            e.printStackTrace();
        }
    }
}
