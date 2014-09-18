package com.core.tools;

import com.engine.graphics.SpriteSheet;

public class Textures {

	public static SpriteSheet guis;

	public static void load() {

		guis = new SpriteSheet("/textures/gui.png");
		guis.loadSprite("INVENTORYGUI", 0, 0, 89, 89);

	}

}
