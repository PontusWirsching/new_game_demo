package com.core;

import com.engine.LEngine;

public class Start extends LEngine {

	public Start(int width, int height, String title) {
		super(width, height, title);
		
		start();
	}

	@Override
	public void update() {

	}
	
	@Override
	public void render() {
		System.out.println("fuck");
	}

	public static void main(String[] args) {
		new Start(1024, 720, "Game Demo");
	}

}
