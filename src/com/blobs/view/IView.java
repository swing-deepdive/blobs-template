package com.blobs.view;

public interface IView {

    void showBlob(int index);

    void hideBlob(int index);

    void updateScore(int score);

    void gameOver();

    void gameStarted();

    void highscoreSubmitted(int score, String name);
}
