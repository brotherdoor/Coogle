package coogle.service;

import java.util.List;

import coogle.domain.Accuse;
import coogle.domain.Comment;
import coogle.domain.Post;

public interface PostService {
	
//	Post
	public int registerPost(Post post);
	public void modifyPost(Post post);
	public void removePost(String postId);
	
	public Post serachPostById(String postId);
	public List<Post> searchAllPost();
	public List<Post> searchPostByTitle(String title);
	public List<Post> searchPostByWriter(String writerId);
	
	
//	Accuse
	public void registerAccuse(Accuse accuse);
	public boolean checkAccuse(String userId, String postId);
	
//	Comment
	public void registerPostComment(Comment comment);
	public void removePostComment(String commentId);
	public void modifyPostComment(String commentId);
	
	
	
	

}
