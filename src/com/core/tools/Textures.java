package com.core.tools;

import com.engine.graphics.SpriteSheet;

public class Textures {

	public static SpriteSheet items;
	
	public static void load() {
		
		items = new SpriteSheet("/textures/items.png");
		
		items.loadSprite("ENGINE_UPGRADE", 0, 0, 32, 32);
		items.loadSprite("STORAGE_UPGRADE", 32, 0, 32, 32);

		
	}
	
}
