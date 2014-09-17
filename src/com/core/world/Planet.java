package com.core.world;

import java.awt.Color;
import java.awt.Graphics;

import com.engine.tools.math.Vector2i;

public class Planet {

	public Vector2i pos;
	public String name;

	public Color color = Color.white;
	
	public Planet(int x, int y, String name) {
		pos = new Vector2i(x, y);
		this.name = name;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g) {
		
		g.setColor(color);
		
		
	}

}
