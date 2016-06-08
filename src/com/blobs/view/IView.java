package com.blobs.view;

import java.util.Map;

public interface IView {

    void showSlot(int index);

    void hideSlot(int index);

    void updateScore(int score);

    void gameOver();

    void gameStarted();

    void highscoreSubmitted(int score, String name);

    void showLeaderboards(Map<String, Integer> leaderboardMap);
}
