package com.core.tools;

import com.engine.graphics.SpriteSheet;

public class Textures {

	public static SpriteSheet items;
	public static SpriteSheet guis;

	public static void load() {
		
		items = new SpriteSheet("/textures/items.png");
		guis = new SpriteSheet("/textures/gui.png");

		
		
	}
	
}
