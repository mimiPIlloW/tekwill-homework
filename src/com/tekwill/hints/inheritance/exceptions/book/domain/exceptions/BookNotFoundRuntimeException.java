package com.tekwill.hints.inheritance.exceptions.book.domain.exceptions;

public class BookNotFoundRuntimeException extends RuntimeException {
    public BookNotFoundRuntimeException(String s) {
        super(s);
    }
}
