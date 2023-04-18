package com.ciit.Talaan.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ciit.proacademy.springboot.model.Instructor;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "title")
	private String title;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Author", referencedColumnName="id ")
	private Author Author;
	
	@Column(name = "year_published")
	private String year_published;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Genre", referencedColumnName="id ")
	private Genre Genre;
	
	@Column(name = "viewlink")
	private String viewlink;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private Double price;

	// default constructor
	public Book() {
	}

	// generated constructor
	public Book(String title, String author, String year, String genre, String viewlink, String description, Double price) {
		super();
		this.title = title;
		this.year_published = year;
		this.viewlink = viewlink;
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
	
	public String getViewlink() {
		return viewlink;
	}

	public void setViewlink(String viewlink) {
		this.viewlink = viewlink;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
