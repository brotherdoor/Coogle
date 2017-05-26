package coogle.service;

import java.util.List;

import coogle.domain.Accuse;
import coogle.domain.Notice;
import coogle.domain.User;
import coogle.domain.Warning;

public interface AdminService {

	public void removeAccuse(String accuseId);
	public List<Accuse> searchAllAccuse();
	public void registerWarning(Warning warning);
	public void registerNotice(Notice notice);
	public void removeNotice(String noticeId);
	public void modifyNotice(Notice notice);
	public User searchByUserId(String id);
	public List<User> searchAllUser();
	public List<Notice> searchAllNotice();
	public void removeUser(String userId);
	public void removePost(String postId);
	public void removeRecipe(String recipeId);
	public void removeComment(String commentId);
	public void registerCF(String title, String content);
	public void modifyCF(String title, String content);
	
}
