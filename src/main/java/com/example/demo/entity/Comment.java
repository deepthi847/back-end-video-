package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comment_id;
    private String commenter;
    private String post;
    private String comment;
    private String date;
    
    public Comment() {
    	
    }
    public Comment(String commenter, String post, String comment, String date) {
        this.commenter = commenter;
        this.post = post;
        this.comment = comment;
        this.date = date;
    }
	public Integer getComment_id() {
		return comment_id;
	}
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", commenter=" + commenter + ", post=" + post + ", comment="
				+ comment + ", date=" + date + "]";
	}
	

}
    
