package com.core;

import java.awt.Graphics;

import com.core.world.World;
import com.core.world.WorldGenerator;
import com.engine.input.Keyboard;
import com.engine.state.State;

public class Game extends State {

	public static World currentWorld;
	
	public static int xOffset, yOffset;
	
	public Game(String name) {
		super(name);
		
		currentWorld = new World();
		
		WorldGenerator.generatePlanets();
		
		
	}

	int speed = 5;
	
	@Override
	public void update() {
		currentWorld.update();

		if (Keyboard.getKey(0)) {
			xOffset += speed;
		}
		if (Keyboard.getKey(2)) {
			xOffset -= speed;
		}
		
		
	}
	
	@Override
	public void render(Graphics g) {
		
		currentWorld.render(g);
	}



}
