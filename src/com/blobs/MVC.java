package com.blobs;

import com.blobs.controller.Controller;
import com.blobs.controller.IController;
import com.blobs.model.Game;
import com.blobs.model.IModel;
import com.blobs.view.IView;
import com.blobs.view.View;

/**
 * A class with static methods to get access ot the model, the view and the controller from
 * anywhere. This was done for simplicity and is not a good design practice. Please do not use
 * it on your exams.
 */
public class MVC {
    private static IModel model;
    private static IView view;
    private static IController controller;

    /**
     * This creates model, view and the controller, and thus pretty much launches the game.
     */
    static void launch() {
        view = new View();
        model = new Game(view);
        controller = new Controller(model);
        view.startProgram();
    }

    /**
     * Gets the model.
     *
     * @return The model.
     */
    public static IModel getModel() {
        return model;
    }

    /**
     * Gets the view.
     *
     * @return The view.
     */
    public static IView getView() {
        return view;
    }

    /**
     * Gets the controller.
     *
     * @return The controller.
     */
    public static IController getController() {
        return controller;
    }
}
