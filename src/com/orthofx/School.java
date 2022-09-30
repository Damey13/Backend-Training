package com.orthofx;

import java.util.ArrayList;
import java.util.List;

public class School {

	private int id;

	private String name;

	private List<Student> students = new ArrayList<>();

	public School(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
