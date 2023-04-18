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
@Table(name = "authors")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	

	// default constructor
	public Author() {
	}

	// generated constructor
	public Author(String firstname, String lastname) {
		super();
		this.first_name = firstname;
		this.last_name = lastname;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return first_name;
	}

	public void setFirstname(String firstname) {
		this.first_name = firstname;
	}

	public String getLastname() {
		return Last_name;
	}

	public void setLastname(String Lastname) {
		this.Last_name = lastname;
	}

	
}
