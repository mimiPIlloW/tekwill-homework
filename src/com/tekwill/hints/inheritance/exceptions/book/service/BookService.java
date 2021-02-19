package com.tekwill.hints.inheritance.exceptions.book.service;

import com.tekwill.hints.inheritance.exceptions.book.domain.Book;
import com.tekwill.hints.inheritance.exceptions.book.domain.exceptions.BookNotFoundCheckedException;
import com.tekwill.hints.inheritance.exceptions.book.domain.exceptions.BookNotFoundRuntimeException;

public interface BookService {
    Book getBookByIsbn(
            String isbn) throws BookNotFoundRuntimeException, NullPointerException, BookNotFoundCheckedException;
}
