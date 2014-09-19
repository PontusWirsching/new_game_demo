package com.core.world;

import java.util.Random;

import com.core.Game;
import com.engine.LEngine;
import com.engine.tools.math.Util;

public class WorldGenerator {

	public static Random random = new Random();

	public static int currentX = LEngine.WIDTH / 2, currentY = LEngine.HEIGHT / 2;

	public static int currentDistance = 0;

	public static void tryToGenerate() {

		World w = Game.currentWorld;

		if (w.planets.isEmpty()) {
			generatePlanet(LEngine.WIDTH / 2, LEngine.HEIGHT / 2);
		}

		boolean generate = false;

		int x = random.nextInt(Game.genRadius * 2);
		int y = random.nextInt(Game.genRadius * 2);

		x += -Game.xOffset + LEngine.WIDTH - Game.genRadius;
		y += -Game.yOffset + LEngine.HEIGHT - Game.genRadius;

		System.out.println(x + ", " + y);
		for (int i = 0; i < w.planets.size(); i++) {
			System.out.println("PLANET: " + i);
			if (Util.getDistance(x, y, w.planets.get(i).pos.x, w.planets.get(i).pos.y) < 500 && Util.getDistance(x, y, w.planets.get(i).pos.x, w.planets.get(i).pos.y) > 50) {
				generate = true;
			} else {
				generate = false;
			}
		}

		if (generate) {
			generatePlanet(x, y);
		}

	}

	public static void generatePlanets() {
		for (int i = 0; i < 50; i++) {
			Planet p = generatePlanet(currentX, currentY);

		}
	}

	public static Planet generatePlanet(int x, int y) {

		Planet planet = new Planet(x, y, "RANDOM_NAMES_GOES_HERE");
		planet.radius = random.nextInt(5) + 10;
		if (Game.currentWorld != null) {
			Game.currentWorld.planets.add(planet);
		}
		return planet;
	}

}
