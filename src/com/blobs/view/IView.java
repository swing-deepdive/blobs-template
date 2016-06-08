package com.blobs.view;

import com.blobs.controller.IController;
import com.blobs.model.Blob;
import com.blobs.model.Ranking;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IView {

    void setController(IController controller);

    void showSlot(Blob blob);

    void hideSlot(Blob blob);

    void updateScore(int score);

    void gameOver();

    void gameStarted(Blob[] blobs);

    void highscoreSubmitted(int score, String name);

    void run();

    void showLeaderboards(Set<Ranking> leaderboard);
}
