package coogle.domain;

import java.sql.Date;
import java.util.List;

public class Fridge {
	private String fridgeId;
	private String userId;
	private List<Ingredient> ingredients;
	private Date registerTimes;
	public String getFridgeId() {
		return fridgeId;
	}
	public void setFridgeId(String fridgeId) {
		this.fridgeId = fridgeId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public Date getRegisterTimes() {
		return registerTimes;
	}
	public void setRegisterTimes(Date registerTimes) {
		this.registerTimes = registerTimes;
	}
	

}
