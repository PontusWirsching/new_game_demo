package com.core.entity;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import com.engine.input.Keyboard;

public class Player extends Mob {
	
	public Player() {
		Keyboard.addKey(KeyEvent.VK_D);
		Keyboard.addKey(KeyEvent.VK_RIGHT);
		Keyboard.addKey(KeyEvent.VK_A);
		Keyboard.addKey(KeyEvent.VK_LEFT);
	}
	
	public void update() {

	}
	
	public void render(Graphics g) {
		
	}

}
