package com.core;

import java.awt.Graphics;

import com.core.world.World;
import com.core.world.WorldGenerator;
import com.engine.state.State;

public class Game extends State {

	public static World currentWorld;
	
	public Game(String name) {
		super(name);
		
		currentWorld = new World();
		
		WorldGenerator.generatePlanets();
		
		
	}

	@Override
	public void update() {
		currentWorld.update();
	

	}
	
	@Override
	public void render(Graphics g) {
		
		currentWorld.render(g);
	}



}
