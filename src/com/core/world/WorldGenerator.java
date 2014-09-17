package com.core.world;

import java.util.Random;

public class WorldGenerator {

	public static Random random = new Random();
	
	public static void generatePlanet() {
		
		int x = 0;
		int y = 0;
		Planet planet = new Planet(x, y, "RANDOM_NAMES_GOES_HERE");
		planet.radius = random.nextInt(50) + 50;
		
		
		
		
		
	}
	
}
