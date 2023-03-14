package com.ciit.Talaan.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciit.Talaan.Models.Book;
import com.ciit.Talaan.Repositories.BookRepository;

@RestController
@RequestMapping("/talaan")
public class BookController {
	@Autowired
	private BookRepository bookRepository;

	// get all books
	@GetMapping("/library")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}
