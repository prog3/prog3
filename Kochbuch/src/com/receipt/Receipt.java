package com.receipt;

import java.io.Serializable;
import java.util.LinkedList;

public class Receipt implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int duration;
	private Difficulty difficulty;
	private String receipt;
	private LinkedList<Ingredient> ingredientList;
	private Course course;
	private String category;

	//TODO	private LinkedList<String> tagList;

	public Receipt(String name, String receipt, int duration, Difficulty difficulty, Course course, LinkedList<Ingredient> ingredientList, String category) {
		this.name = name;
		this.receipt = receipt;
		this.duration = duration;
		this.difficulty = difficulty;
		this.ingredientList = ingredientList;
		this.course = course;
		this.category = category;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public LinkedList<Ingredient> getIngredients() {
		return ingredientList;
	}

	public void setIngredients(LinkedList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Receipt [name=" + name + ", duration=" + duration + ", difficulty=" + difficulty + ", receipt=" + receipt + ", ingredientList="
				+ ingredientList + ", category=" + category + "]";
	}

}
