package com.tekwill.hints.trivia.interfaces.domain.exceptions;

public class EmptyQuestionTextException extends RuntimeException {
    public EmptyQuestionTextException(String s) {
        super(s);
    }
}
