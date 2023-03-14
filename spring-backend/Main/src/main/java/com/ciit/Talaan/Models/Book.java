package com.ciit.Talaan.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "year_published")
	private String year_published;
	@Column(name = "genre")
	private String genre;
	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private String price;

	// default constructor
	public Book() {
	}

	// generated constructor
	public Book(String title, String author, String year, String genre, String description, String price) {
		super();
		this.title = title;
		this.author = author;
		this.year_published = year;
		this.genre = genre;
		this.description = description;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYear() {
		return year_published;
	}

	public void setYear(String year) {
		this.year_published = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
