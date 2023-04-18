package com.ciit.Talaan.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciit.Talaan.Models.Book;
import com.ciit.Talaan.Repositories.BookRepository;
import com.ciit.proacademy.springboot.exception.ResourceNotFoundException;
import com.ciit.proacademy.springboot.model.Course;
import com.ciit.proacademy.springboot.model.Instructor;
import com.ciit.proacademy.springboot.model.Student;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository AuthorRepository;
	
	@Autowired
	private GenreRepository bookRepository;

	// get all books
	@GetMapping("")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	

		// get book by id 
		@GetMapping("{id}")
		public ResponseEntity<Book> getBookById(@PathVariable int id) {
			Course course = bookRepository.findById(id).
					orElseThrow(() -> new ResourceNotFoundException("Book does not exist with id:" + id));
			return ResponseEntity.ok(book);
		}
		
		// create book
		@PostMapping("/create-book")
		Book createBook(@RequestBody Book book) {
			return bookRepository.save(book);
		}
		
		// delete book
		@DeleteMapping("{id}")
		public ResponseEntity<Map<String, Boolean>> deleteBook(@PathVariable int id){
			Book book = bookRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));
			
			bookRepository.delete(book);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		
		// update book
		@PutMapping("/{id}")                                                                                                     
		public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book bookInfo){
			
			Book book = bookRepository.findById(id).
					orElseThrow(() -> new ResourceNotFoundException("Book does not exist with id:" + id));
			
			book.setTitle(bookInfo.getTitle());
			book.setAuthor(bookInfo.getAuthor());
			book.setYear(bookInfo.getYear());
			book.setGenre(bookInfo.getGenre());
			book.setViewlink(bookInfo.getViewlink());
			book.setDescription(bookInfo.getDescription());
			book.setPrice(bookInfo.getPrice());
			
			
			
			Book updatedBook = bookRepository.save(book);
			return ResponseEntity.ok(updatedBook);
		}
		
		// put genre to book 
		// many-to-many relationship
		@PutMapping("/{genreID}/book/{bookId}")
		Book assignGenreToBook(@PathVariable int genreID, @PathVariable int bookID) {
			
			
			Genre genre = genreRepository.findById(genreID).get();
			Book book = bookRepository.findById(bookId).get();
			
			book.getGenre().add(book);
			
			return bookRepository.save(book);
		}
		
		// put author to book 
		// one-to-many relationship
		@PutMapping("/{authorID}/book/{bookID}")
		Course assignAuthorToBook(@PathVariable int authorId, @PathVariable int bookId) {
			
			Book book = bookRepository.findById(bookId).get();
			Author author = authorRepository.findById(authorId).get();
			
			book.setAuthor(author);
			
			return bookRepository.save(book);
		}

	}
