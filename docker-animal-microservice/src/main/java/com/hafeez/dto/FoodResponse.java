package com.hafeez.dto;

public class FoodResponse {
	String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public FoodResponse(String foodName) {
		super();
		this.foodName = foodName;
	}

	@Override
	public String toString() {
		return "FoodResponse [foodName=" + foodName + "]";
	}

	public FoodResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
}
