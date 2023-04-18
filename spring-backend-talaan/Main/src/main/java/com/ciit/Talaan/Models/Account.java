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
@Table(name = "accounts")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@OnetoMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Book", referencedColumnName="id ")
	private Set<Book> books = new HashSet<>();
	

	// default constructor
	public Account() {
	}

	// generated constructor
	public Account(String username, String email, String password) {
		super();
		this.user_name = username;
		this.email = email;
		this.password = password;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.user_name = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}	

	
}
