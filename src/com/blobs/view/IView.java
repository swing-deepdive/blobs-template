package com.blobs.view;

import com.blobs.model.Blob;

import java.util.Map;

public interface IView {

    void showSlot(Blob blob);

    void hideSlot(Blob blob);

    void updateScore(int score);

    void gameOver();

    void gameStarted();

    void highscoreSubmitted(int score, String name);

    void showLeaderboards(Map<String, Integer> leaderboardMap);
}
