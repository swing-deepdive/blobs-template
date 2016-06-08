package com.blobs;

import com.blobs.controller.Controller;
import com.blobs.model.Game;
import com.blobs.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		Game game = new Game(view);
		Controller controller = new Controller(game);
		view.setController(controller);
		view.run();
	}

}
