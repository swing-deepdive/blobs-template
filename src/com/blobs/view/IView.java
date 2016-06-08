package com.blobs.view;

import com.blobs.controller.IController;
import com.blobs.model.Blob;
import com.blobs.model.Ranking;

import java.util.List;

public interface IView {

    void setController(IController controller);

    void showSlot(Blob blob);

    void hideSlot(Blob blob);

    void updateScore(int score);

    void gameOver();

    void gameStarted(Blob[] blobs);

    void run();

    void showLeaderboards(List<Ranking> leaderboard);
}
