package com.tekwill.hints.trivia.interfaces.domain.exceptions;

public class InvalidScoreException extends RuntimeException {
    public InvalidScoreException(String s) {
        super(s);
    }
}
