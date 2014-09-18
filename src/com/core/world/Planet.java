package com.core.world;

import java.awt.Color;
import java.awt.Graphics;

import com.engine.tools.math.Vector2i;

public class Planet {

	public Vector2i pos;
	public String name;
	public int radius = 50;

	public Color color = Color.white;

	public Planet(int x, int y, String name) {
		pos = new Vector2i(x, y);
		this.name = name;
	}

	public void update() {

	}

	public void render(Graphics g) {

		g.setColor(color);

		g.drawOval(pos.getX() - radius, pos.getY() - radius, radius * 2, radius * 2);
		
	}

}
