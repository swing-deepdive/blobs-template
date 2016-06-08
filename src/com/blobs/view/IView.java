package com.blobs.view;

public interface IView {

    void showSlot(int index);

    void hideSlot(int index);

    void updateScore(int score);

    void gameOver();

    void gameStarted();

    void highscoreSubmitted(int score, String name);
}
