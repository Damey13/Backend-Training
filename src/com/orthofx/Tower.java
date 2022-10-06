package com.orthofx;


public class Tower {

	private int towerNum;
	private String towerName;


	public Tower(int id, String name) {
		this.towerNum = id;
		this.towerName = name;
	}
	
	
	public int getId() {
		return towerNum;
	}
	
	public String getName() {
		return towerName;
	}

}
