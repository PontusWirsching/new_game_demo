package com.core.entity;

import java.awt.Color;
import java.awt.Graphics;

import com.core.item.Inventory;
import com.engine.input.Keyboard;

public class Player extends Mob {

	private Inventory inventory;
	
	public boolean walking = false;

	public Player() {
		inventory = new Inventory();
	}

	public void update() {
		int xa = 0, ya = 0;
		if (Keyboard.getKey(0) || Keyboard.getKey(1)) {
			xa++;
		}
		if (Keyboard.getKey(2) || Keyboard.getKey(3)) {
			xa--;
		}
		if (xa != 0 || ya != 0) {
			move(xa, ya);
			walking = true;
		} else {
			walking = false;
		}
		inventory.update();
	}

	public void render(Graphics g) {
		if (walking) {
			g.setColor(Color.WHITE);
			g.drawRect(200, 200, 50, 50);
		}
		inventory.render(g);
	}

}
