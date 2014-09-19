package com.core.item;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.core.tools.Textures;
import com.engine.LEngine;
import com.engine.input.Keyboard;
import com.engine.input.Mouse;

public class Inventory {

	Image inventorySelectIcon;

	boolean showingInventory = false;
	boolean b = false;

	public boolean selectedBox1 = false;
	public boolean selectedBox2 = false;

	public Inventory() {

		try {
			inventorySelectIcon = ImageIO
					.read(Inventory.class
							.getResourceAsStream("/textures/inventorySelectButton.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void update() {
		if (Keyboard.getKey(4) && !b) {
			b = true;
			showingInventory = !showingInventory;
		} else if (!Keyboard.getKey(4) && b) {
			b = false;
		}
		selectBox();
	}

	public void render(Graphics g) {

		// Rendering Inventory

		if (showingInventory) {
			g.drawImage(Textures.guis.get("INVENTORYGUI"),
					LEngine.WIDTH / 2 - 200, LEngine.HEIGHT / 2 - 200, 400,
					400, null);
		}

		// Rendering Inventory Select Icons

		if (showingInventory) {
			if (selectedBox1) {
				selectedBox2 = false;
				g.drawImage(inventorySelectIcon, 339, 187, 76, 76, null);
			} 
			if(selectedBox2) {
				selectedBox1 = false;
				g.drawImage(inventorySelectIcon, 429, 187, 76, 76, null);
			}
		}

	}

	public void selectBox() {
		
		// Mouse Input Selecting Inventory Boxes

		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		System.out.println("Mouse X: " + mouseX + ", Mouse Y: " + mouseY);
		if (Mouse.getButton() == 1) {
			if ((mouseX >= 339) && (mouseX <= 412) && (mouseY >= 187)
					&& (mouseY <= 262)) {
				selectedBox1 = true;
			}
			if((mouseX >= 429) && (mouseX <= 503) && (mouseY >= 187)
					&& (mouseY <= 262)) {
				selectedBox2 = true;
			}
		}
	}
}
