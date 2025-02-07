package com.hafeez.dto;

import java.util.List;

public class AnimalFoodResponse {
	List<FoodResponse> res;

	public List<FoodResponse> getRes() {
		return res;
	}

	public void setRes(List<FoodResponse> res) {
		this.res = res;
	}

	public AnimalFoodResponse(List<FoodResponse> res) {
		super();
		this.res = res;
	}

	public AnimalFoodResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
}
