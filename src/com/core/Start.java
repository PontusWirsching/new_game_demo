package com.core;

import com.core.entity.Player;
import com.engine.LEngine;
import com.engine.state.StateHandler;

public class Start extends LEngine {

	private Player player;

	public Start(int width, int height, String title) {
		super(width, height, title);

		StateHandler.addState(new Game("GAME"));
		StateHandler.setState("GAME");
		
		player = new Player();

		skipIntro();
		start();

	}

	@Override
	public void update() {
		
		StateHandler.update();
		
		player.update();
	}

	@Override
	public void render() {
		
		StateHandler.render(g);
		
		player.render(g);
	}

	public static void main(String[] args) {
		new Start(1024, 720, "Game Demo");
	}

}
