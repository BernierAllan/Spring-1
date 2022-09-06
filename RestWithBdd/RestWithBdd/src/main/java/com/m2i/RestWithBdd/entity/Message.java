package com.m2i.RestWithBdd.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String author;
	private Date date;
	private String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Message(int id, String author, Date date, String text) {
		super();
		this.id = id;
		this.author = author;
		this.date = date;
		this.text = text;
	}
	public Message(String author, Date date, String text) {
		super();
		this.author = author;
		this.date = date;
		this.text = text;
	}
	public Message() {
		super();
	}
	
	
	
}
