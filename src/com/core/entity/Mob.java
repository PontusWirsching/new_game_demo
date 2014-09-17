package com.core.entity;

import java.awt.Graphics;

public class Mob extends Entity {

	protected int direction = 0;

	public void move(int xa, int ya) {
		if (xa != 0 && ya != 0) {
			move(xa, 0);
			move(0, ya);
			return;
		}
		if (ya < 0)
			direction = 0;
		if (xa > 0)
			direction = 1;
		if (ya > 0)
			direction = 2;
		if (xa < 0)
			direction = 3;
	}

	public void render(Graphics g) {

	}
	
	public void update() {
		
	}

	public int getXCoordinate() {
		return x;
	}

	public int getYCoordinate() {
		return y;
	}

}
