package com.tekwill.hints.inheritance.exceptions.book.repo;

import com.tekwill.hints.inheritance.exceptions.book.domain.Book;
import com.tekwill.hints.inheritance.exceptions.book.domain.exceptions.BookNotFoundCheckedException;
import com.tekwill.hints.inheritance.exceptions.book.domain.exceptions.BookNotFoundRuntimeException;

public interface BookRepository {
    Book findBook(String isbn) throws BookNotFoundRuntimeException, BookNotFoundCheckedException;
}
