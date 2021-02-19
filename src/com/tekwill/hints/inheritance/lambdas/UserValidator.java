package com.tekwill.hints.inheritance.lambdas;

@FunctionalInterface
public interface UserValidator {
    boolean validate(User user);
}
