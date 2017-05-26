package coogle.store;

import java.util.List;

import coogle.domain.Comment;
import coogle.domain.History;
import coogle.domain.Recipe;

public interface RecipeStore {
	
//	Scrap
	public void insertScrap(String loginId, String recipeId);
	public void deleteScrap(String loginId, String recipeId);
	public List<Recipe> selectScrap(String loginId);
	public boolean checkScrap(String loginId, String recipeId);
	
//	Recipe
	public int insertRecipe(Recipe recipe);
	public void updateRecipe(Recipe recipe);
	public void deleteRecipe(String recipeId);
	
	public Recipe selectRecipeById(String recipeId);
	public List<Recipe> selectAllRecipe();
	public List<Recipe> selectRecipeByTitle(String title);
	public List<Recipe> selectRecipeByWriter(String writerId);
	public List<Recipe> selectRecipeByCategory(String category);
	public List<Recipe> selectRecipeByIngredient(String... ingredient);
	
//	Comment
	public void insertRecipeComment(Comment comment);
	public void updateRecipeComment(Comment comment);
	public void deleteRecipeComment(String commentId);
	public List<Comment> selectRecipeComment(String recipeId);
	
//	History
	public List<History> selectHistory(String loginId);
	public void insertHistory(String loginId, String recipeId);
	public void deleteHistory(String historyId);
	public boolean checkHistory(String loginId, String recipeId);
	
//	Like	
	public void insertLike(String recipeId, String loginId);
	public boolean checkLike(String recipeId, String loginId);	 
	
//	Note
	public int insertNote(String historyId, String note);
	public void updateNote(String historyId, String note);
	
}
