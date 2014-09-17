package com.core.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import com.engine.input.Keyboard;

public class Player extends Mob {

	public boolean walking = false;

	public Player() {
		Keyboard.addKey(KeyEvent.VK_D);
		Keyboard.addKey(KeyEvent.VK_RIGHT);
		Keyboard.addKey(KeyEvent.VK_A);
		Keyboard.addKey(KeyEvent.VK_LEFT);
		
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
	}

	public void render(Graphics g) {
		if (walking) {
			g.setColor(Color.WHITE);
			g.drawRect(200, 200, 50, 50);
		}
	}

}
