package coogle.service;

import java.util.List;

import coogle.domain.Ingredient;

public interface IngredientService {
	
	public void registerRefrigerator(String loginId, String ingredientName);
	public void registerMemo(String loginId, String ingredientName);
	public List<Ingredient> searchRefiger(String loginId);
	public List<Ingredient> searchMemo(String loginId);
	public void removeRefrigerator(String loginId, String ingredientId);
	public void removeMemo(String loginId, String ingredientId);

}
