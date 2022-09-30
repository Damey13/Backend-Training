package com.orthofx;

public class Tenant {


	
	private int id;
	
	private String name;
	
	private Tower tower;
	
	public Tenant(int id, String name, Tower tower) {
		this.id = id;
		this.name = name;
		this.tower = tower;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTowerName() {
		return tower.getName();
	}

}
