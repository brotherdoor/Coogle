package coogle.service;

import java.util.List;

import coogle.domain.Accuse;
import coogle.domain.Comment;
import coogle.domain.History;
import coogle.domain.Recipe;

public interface RecipeService {
	
	
	public void registerScrap(String loginId, String recipeId);
	public void removeScrap(String loginId, String recipeId);
	public List<Recipe> searchScrap(String loginId);
	public Recipe searchRecipeById(String recipeId);
	public int registerRecipe(Recipe recipe);
	public void modifyRecipe(Recipe recipe);
	public void removeRecipe(String recipeId);
	public List<Recipe> searchAllRecipe();
	public List<Recipe> searchByNameRecipe(String title);
	public List<Recipe> searchByIngredientRecipe(String... ingredient);
	public List<Recipe> searchByWriterRecipe(String writerId);
	public void registerAccuse(Accuse accuse);
	public boolean registerLike(String recipeId, String loginId);
	public List<Recipe> searchByCategoryRecipe(String category);
	public Recipe registerRComment(Comment commnet);
	public void modifyRComment(Comment comment);
	public void removeRComment(String commentId);
	public List<History> searchHistoryList(String loginId);
	public History searchHitoryById(String historyId);
	public void registerHistory(String loginId, String recipeId);
	public void selectHistory(String history);
	public void deleteHistoryByRecipeId(String recipeId);
	public List<Comment> searchRComment(String recipeId);
	public boolean checkLike(String recipeId, String loginId);
	public boolean checkHistory(String recipeId, String loginId);
	public boolean checkScrap(String recipeId, String loginId);
	public void registerNote(String historyId, String note);
	public void modifyNote(String historyId, String note);
	
	
	
	
	
}
