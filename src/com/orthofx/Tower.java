package com.orthofx;

//import java.util.ArrayList;
//import java.util.List;

public class Tower {

	private int towerNum;
	private String towerName;

//	private List<Tenant> tenants = new ArrayList<>();

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
