package com.example;

import javax.inject.Inject;

public class BookService {

	@Inject
	@ThirteenDIgits
	private NumberGenerator generator;

//	public BookService(NumberGenerator generator) {
//		this.generator = generator;
//	}

	public Book createBook(String title) {
		return new Book(title, generator.generateNumber());
	}
}
