package com.core.item;

public class Item {

	protected int id, maxStack;
	protected String itemName;

	public Item(int id, String itemName, int maxStack) {
		this.id = id;
		this.maxStack = maxStack;
	}

	public int getId() {
		return id;
	}

	public int getMaxStack() {
		return maxStack;
	}

	public String getItemName() {
		return itemName;

	}

}
