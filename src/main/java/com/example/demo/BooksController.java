package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1L, "Mastering Spring", "YB"), 
							 new Book(2L, "Masteri2 Spring2", "Yad"),
							 new Book(2L, "Book 3", "Yad2"),
							 new Book(2L, "Book4", "Yad4"));
	}

}
