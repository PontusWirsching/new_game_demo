package com.core.world;

import java.util.Random;

import com.core.Game;
import com.engine.LEngine;

public class WorldGenerator {

	public static Random random = new Random();

	public static int currentX = LEngine.WIDTH / 2, currentY = LEngine.HEIGHT / 2;

	public static int currentDistance = 0;
	
	public static void generatePlanets() {
		for (int i = 0; i < 50; i++) {
			Planet p = generatePlanet(currentX, currentY);
			
			currentDistance += p.radius * 2;
		
			int angle = random.nextInt(360);
			System.out.println(angle);

			angle -= 90.0;
			
			currentX  += (int) (Math.cos(Math.toRadians(angle)) * currentDistance);
			currentY  += (int) (Math.sin(Math.toRadians(angle)) * currentDistance);


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
