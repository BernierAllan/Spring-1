package com.allan.helloworld.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Message {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	private String author;
    
	private LocalDateTime date;
    
	private String message;
	
	public Message(String author, String message) {
		this.author = author;
		this.date = LocalDateTime.now();
		this.message = message;
	}
	
	public Message() {
		this.date = LocalDateTime.now();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
