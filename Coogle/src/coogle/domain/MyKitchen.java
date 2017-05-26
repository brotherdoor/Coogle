package coogle.domain;

import java.util.List;

public class MyKitchen {

	
	private String userId;
	private List<User> follows;
	private List<History> historys;
	private List<Recipe> scraps;
	private List<Recipe> registerRecipe;
	private Memo memo;
	private Fridge fridge;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<User> getFollows() {
		return follows;
	}
	public void setFollows(List<User> follows) {
		this.follows = follows;
	}
	public List<History> getHistorys() {
		return historys;
	}
	public void setHistorys(List<History> historys) {
		this.historys = historys;
	}
	public List<Recipe> getScraps() {
		return scraps;
	}
	public void setScraps(List<Recipe> scraps) {
		this.scraps = scraps;
	}
	public List<Recipe> getRegisterRecipe() {
		return registerRecipe;
	}
	public void setRegisterRecipe(List<Recipe> registerRecipe) {
		this.registerRecipe = registerRecipe;
	}
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public Fridge getFridge() {
		return fridge;
	}
	public void setFridge(Fridge fridge) {
		this.fridge = fridge;
	}
	
	
	
}
