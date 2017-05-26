package coogle.store;

import java.util.List;

import coogle.domain.User;

public interface UserStore {

	public User selectByUserId(String id);
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(String userId);
	public List<User> selectAllUser();
	public void registerFollowing(String id, String followingId);
	public List<User> selectFollowerList(String loginId, String followId);
	public List<User> selectFollowingList(String loginId);
	public void deleteFollowing(String loginId, String followingId);
//	public User selectAccount(String phone);
}
