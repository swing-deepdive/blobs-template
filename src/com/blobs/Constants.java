package com.blobs;

import java.awt.Color;

/**
 * The Constants class offers all kinds of cool parameters you can manipulate to customize your game.
 * Of course you can also take a deep dive into the code and customize anything there.
 */
public final class Constants {

    // Color of the blobs
	public static final Color BLOBS_COLOR = new Color(44, 165, 124);

    // Window width
	public static final int WINDOW_WIDTH = 900;

    // Window height
	public static final int WINDOW_HEIGHT = 700;

    // Please don't change this https://youtu.be/otCpCn0l4Wo?t=17s
	public static final String API_URL = "http://blobs-swing.azurewebsites.net/api/highscore?zumo-api-version=2.0.0";

    // Please also don't change this https://youtu.be/otCpCn0l4Wo?t=17s
    public static final String TABLE_URL = "http://blobs-swing.azurewebsites.net/tables/highscore?zumo-api-version=2.0.0";

    // The game ID used to identify yourself with a specific leaderboard on the server
    public static final String GAME_ID = "";

    // The time it takes for a blob to spawn
	public static final int SPAWN_DELAY = 2000;

    public static final double SPAWN_INC = 0.95;

    // The width of the game field, measured by number of blobs
	public static final int GAMEFIELD_WIDTH = 3;

    // The height of the game field, measured by number of blobs
	public static final int GAMEFIELD_HEIGHT = 3;

    // The duration a blob stays on the game field
	public static final int LIFETIME = 4000;

    // The score a blob brings to your game - you can also randomize it if look in the blob
	public static final int BLOB_SCORE = 4;

    // The score a player gets to start with
	public static final int STARTING_SCORE = 0;
}
