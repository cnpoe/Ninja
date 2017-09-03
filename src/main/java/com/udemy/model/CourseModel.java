package com.udemy.model;

public class CourseModel {
	private String name;
	private String description;
	private int price;
	private int hours;

	public CourseModel() {
		super();
	}

	public CourseModel(String name, String description, int price, int hours) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.hours = hours;
	}

	public String getDescription() {
		return description;
	}

	public int getHours() {
		return hours;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
