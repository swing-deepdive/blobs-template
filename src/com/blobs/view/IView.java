package com.blobs.view;

import com.blobs.controller.IController;
import com.blobs.model.Blob;
import com.blobs.model.Ranking;

import java.util.List;

/**
 * <p>
 *     The IView is the interface that encapsulates the entire view. It defines the view and all
 *     its components and in a way serves as the abstraction from the implementation.
 * </p>
 * <p>
 *     All methods within the IView are called by the model of the program and thus need
 *     to be implemented for the program to work correctly.
 * </p>
 */
public interface IView {

    /**
     * <p>
     *     Adds a {@link Blob} to the game. A blob is the "piece" of the game.
     *     They are created by the model and die after a while. Don't ask us
     *     what they do, it is up to you to decide what uses they really serve.
     * </p>
     * <p>
     *     In this method we give you the shiny new blob, freshly created by our
     *     blobbery with a secret recipe perfected over 1 all-nighter.
     * </p>
     *
     * @param blob The blob that can be anything.
     */
    void addBlob(Blob blob);

    /**
     * <p>
     *     This method should simply remove a {@link Blob}.
     * </p>
     *
     * @param blob The blob that can be anything.
     */
    void removeBlob(Blob blob);

    /**
     * <p>
     *     This method is called by the model when the score updates so that it can be
     *     reflected back in the view.
     * </p>
     *
     * @param score The new score of the game!
     */
    void updateScore(int score);

    /**
     * <p>
     *     This method is called by the model when the game is over, to notify to view so that
     *     it can act accordingly.
     * </p>
     */
    void gameOver();

    /**
     * <p>
     *     This method is called by the model when the game started, to notify to view so that it
     *     can act accordingly.
     * </p>
     */
    void gameStarted();

    /**
     * <p>
     *     This method is called by the model when the program was launched, to notify to view to act
     *     accordingly.
     * </p>
     */
    void startProgram();

    /**
     * <p>
     *     This method is called by the model to show the current state of the leaderboard from an
     *     online server (yes it is live)!
     * </p>
     *
     * @param leaderboard The list of rankings on the leaderboard.
     */
    void showLeaderboards(List<Ranking> leaderboard);
}
