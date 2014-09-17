package com.core.entity;

import java.awt.Graphics;

public abstract class Entity {

	public int x, y;
	private boolean removed = false;

	public void update() {

	}

	public void render(Graphics g) {

	}

	public void remove() {
		removed = true;
	}

	public boolean isRemoved() {
		return removed;
	}

}
