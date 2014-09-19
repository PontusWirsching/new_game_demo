package com.core;

import java.awt.event.KeyEvent;

import com.core.item.Inventory;
import com.core.tools.Textures;
import com.engine.LEngine;
import com.engine.input.Keyboard;
import com.engine.state.StateHandler;

public class Start extends LEngine {
	
	private Inventory inventory;

	public Start(int width, int height, String title) {
		super(width, height, title);

		StateHandler.addState(new Game("GAME"));
		StateHandler.setState("GAME");
		
		// Declare keys here

		Keyboard.addKey(KeyEvent.VK_D);
		Keyboard.addKey(KeyEvent.VK_RIGHT);
		Keyboard.addKey(KeyEvent.VK_A);
		Keyboard.addKey(KeyEvent.VK_LEFT);
		Keyboard.addKey(KeyEvent.VK_I);
		Keyboard.addKey(KeyEvent.VK_W);
		Keyboard.addKey(KeyEvent.VK_S);

		Textures.load();
		inventory = new Inventory();
		
		skipIntro();
		start();

	}

	@Override
	public void update() {
		StateHandler.update();
		inventory.update();
	}

	@Override
	public void render() {
		Game.worldGraphics = g.create();
		StateHandler.render(g);
		inventory.render(g);

	}

	public static void main(String[] args) {
		new Start(1024, 720, "Game Demo");
	}

}