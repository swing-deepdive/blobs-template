package com.blobs.view;

import com.blobs.controller.IController;
import com.blobs.model.Blob;
import com.blobs.model.Ranking;

import java.util.List;

public interface IView {

    void setController(IController controller);

    void showBlob(Blob blob);

    void hideBlob(Blob blob);

    void updateScore(int score);

    void gameOver();

    void gameStarted();

    void startProgram();

    void showLeaderboards(List<Ranking> leaderboard);
}
