package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer post_id;
    private String text;
    
    private String image_url;
   
    private String date;
   
    public Post() {
    }

    public Post(Integer post_id, String text, String image_url, String date) {
        this.post_id = post_id;
        this.text = text;
        this.image_url = image_url;
        this.date = date;
       
    }

	public Integer getPost_id() {
		return post_id;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", text=" + text + ", image_url=" + image_url + ", date=" + date + "]";
	}
    

    

}