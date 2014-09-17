package com.core.world;

import java.awt.Graphics;
import java.util.ArrayList;

import com.core.entity.Entity;

public class World {

	public ArrayList<Entity> entities = new ArrayList<>();
	public ArrayList<Planet> planets = new ArrayList<>();

	public World() {

	}

	public void update() {
		for (int i = 0; i < entities.size(); i++) {
			entities.get(i).update();
		}
		for (int i = 0; i < entities.size(); i++) {
			if (i < entities.size() && entities.get(i) != null && entities.get(i).isRemoved()) {
				entities.remove(i);
			}
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < entities.size(); i++) {
			if (i < entities.size() && entities.get(i) != null)
				entities.get(i).render(g);
		}
	}

}
