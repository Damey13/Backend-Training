package com.orthofx;

public class Student {
	
	private int id;
	
	private String name;
	
	private School school;
	
	public Student(int id, String name, School school) {
		this.id = id;
		this.name = name;
		this.school = school;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSchoolName() {
		return school.getName();
	}

}
