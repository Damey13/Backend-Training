package com.orthofx;

import java.util.HashMap;
import java.util.Map;

public class App {

	private static Map<Integer, School> schoolTable = new HashMap<>();
	private static Map<Integer, Student> studentTable = new HashMap<>();

	public static void main(String[] args) {

		School bhavans = createSchool("Bhavans");
		School model = createSchool("Model");
		Student sanjay = createStudent("Sanjay", bhavans);

		getSchool(1);
		getStudent(1);

		updateStudent(1, "Karthika", model);
		getStudent(1);

		System.out.println(studentTable.size());
		deleteStudent(1);
		System.out.println(studentTable.size());

	}

	public static School createSchool(String name) {
		School school = new School(schoolTable.size() + 1, name);
		schoolTable.put(school.getId(), school);
		return school;
	}

	public static Student createStudent(String name, School school) {
		Student student = new Student(studentTable.size() + 1, name, school);
		studentTable.put(student.getId(), student);
		return student;
	}

	public static void getSchool(int id) {
		School school = schoolTable.get(id);
		System.out.println(school.getName());
	}

	public static void getStudent(int id) {
		Student student = studentTable.get(id);
		System.out.println(student.getName() + " " + student.getSchoolName());
	}

	public static Student updateStudent(int id, String name, School school) {
		Student student = new Student(id, name, school);
		studentTable.put(id, student);
		return student;
	}

	public static void deleteStudent(int id) {
		studentTable.remove(id);
	}

}
