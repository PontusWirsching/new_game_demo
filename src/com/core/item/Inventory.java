package com.core.item;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.core.tools.Textures;
import com.engine.LEngine;
import com.engine.input.Keyboard;
import com.engine.input.Mouse;
import com.engine.tools.Loader;

public class Inventory {

	Image inventorySelectIcon;

	boolean showingInventory = false;
	boolean b = false;

	public boolean selectedBox1 = false;
	public boolean selectedBox2 = false;

	public Inventory() {

		inventorySelectIcon = Loader.loadImage("/textures/inventorySelectButton.png");
	
		
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
			
			g.drawImage(inventorySelectIcon, (339 + slotX * 76) + 14 * slotX, (187 + slotY * 76) + 14 * slotY, 76, 76, null);
			
			
//			if (selectedBox1) {
//				selectedBox2 = false;
//				g.drawImage(inventorySelectIcon, 339, 187, 76, 76, null);
//			} 
//			if(selectedBox2) {
//				selectedBox1 = false;
//				g.drawImage(inventorySelectIcon, 429, 187, 76, 76, null);
//			}
		}

	}

	int slot_index = 0;
	
	int slotX, slotY;
	
	boolean[] slotMarks = new boolean[16];
	
	public void selectBox() {
		
		// Mouse Input Selecting Inventory Boxes

		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
//		System.out.println("Mouse X: " + mouseX + ", Mouse Y: " + mouseY);
		if (Mouse.getButton() == 1) {
			
			int x = 0, y = 0;
			
			for (int i = 0; i < 4; i++) {
				if (Mouse.getX() >= (339 + i * 76) + 14 * i) {
					x = i;
				}
			}
			for (int i = 0; i < 4; i++) {
				if (Mouse.getY() >= (187 + i * 76) + 14 * i) {
					y = i;
				}
			}
			slot_index = x + y * 4;

			slotX = x;
			slotY = y;
			
			System.out.println("X: " + x + ", Y: " + y + ", Index: " + slot_index);
			
			for (boolean b : slotMarks) {
				b = false;
			}
			
			slotMarks[slot_index] = true;
			
			
//			if ((mouseX >= 339) && (mouseX <= 412) && (mouseY >= 187)
//					&& (mouseY <= 262)) {
//				selectedBox1 = true;
//			}
//			if((mouseX >= 429) && (mouseX <= 503) && (mouseY >= 187)
//					&& (mouseY <= 262)) {
//				selectedBox2 = true;
//			}
		}
	}
}
