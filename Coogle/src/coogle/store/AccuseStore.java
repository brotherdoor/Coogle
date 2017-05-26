package coogle.store;

import java.util.List;

import coogle.domain.Accuse;
import coogle.domain.Warning;

public interface AccuseStore {
	
	public void insertAccuse(Accuse accuse);
	public void deleteAccuse(String objectId, String type);
	public void deleteAccuseByPost(String postId);
	public void deleteAccuseByRecipe(String recipeId);
	public List<Accuse> selectAllAccuse();
	public void insertWarning(Warning warning);
	public void deleteWarning(String warningId);
	public boolean selectAccuseByUserId(String userId);
	
	public boolean checkAccuse(String userId, String postId);

}
