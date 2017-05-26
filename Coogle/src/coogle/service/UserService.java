package coogle.service;

import java.util.List;

import coogle.domain.User;
import coogle.domain.Warning;

public interface UserService {

	public User login(User user);
	public void registerUser(User user);
	public void removeUser(String id);
	public void modifyUser(User user);
	public User searchByUserId(String id);
	public void registerFollowing(String id, String followingId);
	public List<User> searchFollowerList(String loginId, String followId);
	public List<User> searchFollowingLst(String loginId);
	public void removeFollowing(String loginId, String followingId);
	public User searchUserId(String name, String phone);
	public User searchUserPw(String id, String phone);
	public List<Warning> searchWarning(String userId);
//	public User searchAccount(String phone);
	
}
