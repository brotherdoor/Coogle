package coogle.store.mapper;

import java.util.List;

import coogle.domain.Ingredient;

public interface IngredientMapper {
	
	public void insertRefrigerator(Ingredient ingredient, String loginId);
	public void insertMemo(String loginId, Ingredient ingredient);
	public List<Ingredient> selectMemoList(String loginId);
	public void deleteIngredient(String fridgeId, String ingredientId);
	public void deleteMemo(String loginId, String ingredientId);
	
}
