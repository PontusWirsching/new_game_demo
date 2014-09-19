package com.core;

import java.awt.Color;
import java.awt.Graphics;

import com.core.entity.Player;
import com.core.world.World;
import com.core.world.WorldGenerator;
import com.engine.LEngine;
import com.engine.input.Keyboard;
import com.engine.state.State;

public class Game extends State {

	public static World currentWorld;

	public static int xOffset, yOffset;
	private Player player;

	public Game(String name) {
		super(name);

		player = new Player();

		currentWorld = new World();

	}

	int speed = 5;

	@Override
	public void update() {
		currentWorld.update();

		if (Keyboard.getKey(0)) {
			xOffset -= speed;
		}
		if (Keyboard.getKey(2)) {
			xOffset += speed;
		}
		if (Keyboard.getKey(5)) {
			yOffset += speed;
		}
		if (Keyboard.getKey(6)) {
			yOffset -= speed;
		}

		player.update();

		WorldGenerator.tryToGenerate();

	}

	public static Graphics worldGraphics;

	public static int genRadius = 200;

	@Override
	public void render(Graphics g) {

		g.setColor(Color.RED);
		g.drawOval(LEngine.WIDTH / 2 - genRadius, LEngine.HEIGHT / 2
				- genRadius, genRadius * 2, genRadius * 2);

		worldGraphics.translate(xOffset, yOffset);

		currentWorld.render(worldGraphics);

		player.render(worldGraphics);

	}

}
