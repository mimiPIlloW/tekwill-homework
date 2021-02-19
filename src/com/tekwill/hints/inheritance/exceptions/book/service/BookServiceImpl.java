package com.tekwill.hints.inheritance.exceptions.book.service;

import com.tekwill.hints.inheritance.exceptions.book.domain.Book;
import com.tekwill.hints.inheritance.exceptions.book.domain.exceptions.BookNotFoundCheckedException;
import com.tekwill.hints.inheritance.exceptions.book.domain.exceptions.BookNotFoundRuntimeException;
import com.tekwill.hints.inheritance.exceptions.book.repo.BookRepository;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookByIsbn(
            String isbn) throws BookNotFoundRuntimeException, NullPointerException, BookNotFoundCheckedException {
        return bookRepository.findBook(isbn);
    }
}
