package coogle.store;

import java.util.List;

import coogle.domain.CookOrder;

public interface CookOrderStore {
	
	public void insertCookOrder(CookOrder cookOrder);
	public void deleteCookOrder(String recipeId);
	public List<CookOrder> selectAllCookOrder(String recipeId);
	public CookOrder selectCookOrder(String recipeId, String cookOrderId);

}
