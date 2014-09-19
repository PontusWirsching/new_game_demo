package com.core.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import com.core.tools.Textures;
import com.engine.LEngine;
import com.engine.input.Keyboard;
import com.engine.input.Mouse;
import com.engine.tools.Loader;

public class Inventory {

	Image inventorySelectIcon;

	boolean showingInventory = false;
	boolean b = false;

	int slot_index = 0;
	int slotX, slotY;
	boolean[] slotMarks = new boolean[16];

	public Inventory() {

		inventorySelectIcon = Loader
				.loadImage("/textures/inventorySelectButton.png");

	}

	public void update() {
		if (Keyboard.isKeyPressed(KeyEvent.VK_I) && !b) {
			b = true;
			showingInventory = !showingInventory;
		} else if (!Keyboard.isKeyPressed(KeyEvent.VK_I) && b) {
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
			g.drawImage(inventorySelectIcon, (339 + slotX * 76) + 14 * slotX,
					(187 + slotY * 76) + 14 * slotY, 76, 76, null);

		}

	}

	public void selectBox() {

		// Mouse Input Selecting Inventory Boxes

		if (showingInventory) {
			if (Mouse.getButton() == 1) {
				int x = 0, y = 0;

				/*
				 * goes through all slots on X axis (339) starting pixel, (i)
				 * current slot (76) size of pixel,(14) pixel space between
				 * boxes
				 */

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
				for (@SuppressWarnings("unused")
				boolean b : slotMarks) {
					b = false;
				}
				slotMarks[slot_index] = true;
			}

		}
	}
}
