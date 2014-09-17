package com.core;

import com.core.entity.Player;
import com.engine.LEngine;

public class Start extends LEngine {

	private Player player;

	public Start(int width, int height, String title) {
		super(width, height, title);
		
		start();
		
		player = new Player();
	}

	@Override
	public void update() {
		player.update();
	}

	@Override
	public void render() {
		player.render(g);
	}

	public static void main(String[] args) {
		new Start(1024, 720, "Game Demo");
	}

}
