package com.core.item;

import java.awt.Graphics;

import com.core.tools.Textures;
import com.engine.LEngine;
import com.engine.input.Keyboard;

public class Inventory {
	
	boolean showingInventory = false;
	boolean b = false;

	public Inventory() {
		
	}
	
	public void update() {
		if(Keyboard.getKey(4) && !b) {
			b = true;
			showingInventory = !showingInventory;
		} else if(!Keyboard.getKey(4) && b) {
			b = false;
		}
	}
	
	public void render(Graphics g) {
		if(showingInventory) {
			g.drawImage(Textures.guis.get("INVENTORYGUI"), LEngine.WIDTH / 2 - 200, LEngine.HEIGHT / 2 - 200, 400,400, null);
		}
	}

}
