package com.tekwill.hints.inheritance.exceptions.book;

import com.tekwill.hints.inheritance.exceptions.book.controller.BookController;
import com.tekwill.hints.inheritance.exceptions.book.repo.BookRepositoryImpl;
import com.tekwill.hints.inheritance.exceptions.book.service.BookServiceImpl;

public class BookApplication {
    public static void main(String[] args) {
        BookController bookController = new BookController(new BookServiceImpl(new BookRepositoryImpl()));
        bookController.renderViewBookByISBNPage("123456789");
        bookController.renderViewBookByISBNPage("12345678");
//        System.out.println(bookController.renderViewBookByISBNPage("12345679"));
    }
}
