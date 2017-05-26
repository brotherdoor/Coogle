package coogle.store.mapper;

import java.util.List;

import coogle.domain.Comment;
import coogle.domain.Notice;
import coogle.domain.Post;

public interface PostMapper {
	
//	Post
	public int insertPost(Post post);
	public void updatePost(Post post);
	public void deletePost(String postId);
	public void deletePostByWriter(String writerId);
	
	public List<Post> selectAllPost();
	public Post selectPostById(String postId);
	public List<Post> selectPostByTitle(String title);
	public List<Post> selectPostByWriter(String writerId);
	
//	Comment
	public void insertPostComment(Comment comment);
	
	public void deletePostCommentById(String commentId);
	public void deletePostCommentByPost(String postId);
	public void deletePostCommentByUser(String userId);
	
	public void updatePostComment(Comment comment);
	
	public List<Comment> selectPostCommentByPost(String postId);
	
	
//	Notice
	public List<Notice> selectNotcieList();
	public void insertNotice(Notice notice);
	public void deleteNotice(String noticeId);
	public void updateNtocie(Notice notice);
	
	public Notice selectNoticeById(String noticeId);

}
