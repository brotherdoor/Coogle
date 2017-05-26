package coogle.store.mapper;

import java.util.List;

import coogle.domain.CookOrder;

public interface CookOrderMapper {
	
	public void insertCookOrder(CookOrder cookOrder);
	public void deleteCookOrder(String recipeId);
	public List<CookOrder> selectAllCookOrder(String recipeId);
	public CookOrder selectCookOrder(String recipeId, String cookOrderId);

}
