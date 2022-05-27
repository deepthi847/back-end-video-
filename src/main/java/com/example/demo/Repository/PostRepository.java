package com.example.demo.Repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
//	public List<Post>findByPost_id(int post_id);
//	public List<Post> findByTextAndDate(String text,String date);
//	
//	@Query("SELECT p FROM Post p")
//	List<Post> getAllPost();
	
	@Query("select p FROM Post p WHERE p.post_id=:p")
	public List<Post> getPostByPost_id(@Param("p") Integer post_id);
//	
//	@Query(value="select * from post", nativeQuery = true)
//	public List<Post> getPost();
////	
//	@Query("select p from Post p")
//    Stream<Post> findAllStream();
//	@Async
//    CompletableFuture<Post> findByText(String text);
//	List<Post> postByDate(String date);
//	@Query(value = "SELECT * FROM  WHERE  = ?1", nativeQuery = true)
//    List<Post> findByPost_id(int post_id);
//
//

	

	
}
