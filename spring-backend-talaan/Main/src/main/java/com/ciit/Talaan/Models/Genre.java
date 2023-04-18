package com.ciit.Talaan.Models;

import java.util.HashSet;
import java.util.Set;

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
import com.ciit.proacademy.springboot.model.Student;

@Entity
@Table(name = "genres")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "genre")
	private String genre;
	
	
	

	// default constructor
	public Genre() {
	}

	// generated constructor
	public Genre(String genre) {
		super();
		this.genre = genre;
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	

	
}
