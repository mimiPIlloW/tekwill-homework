package com.tekwill.hints.trivia.jdbc.domain.exceptions;

public class EmptyQuestionTextException extends RuntimeException {
    public EmptyQuestionTextException(String s) {
        super(s);
    }
}
