package com.tekwill.hints.trivia.jdbc.domain.exceptions;

public class EmptyAnswerTextException extends RuntimeException {
    public EmptyAnswerTextException(String s) {
        super(s);
    }
}
