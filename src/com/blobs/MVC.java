package com.blobs;

import com.blobs.controller.Controller;
import com.blobs.controller.IController;
import com.blobs.model.Game;
import com.blobs.model.IModel;
import com.blobs.view.IView;
import com.blobs.view.View;

/**
 * Created by root on 08.06.16.
 */
public class MVC {
    private static IModel model;
    private static IView view;
    private static IController controller;

    public static void launch() {
        view = new View();
        model = new Game(view);
        controller = new Controller(model);
        view.setController(controller);
        view.run();
    }

    public static IModel getModel() {
        return model;
    }

    public static IView getView() {
        return view;
    }

    public static IController getController() {
        return controller;
    }
}
