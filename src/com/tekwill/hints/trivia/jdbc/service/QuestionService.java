package com.tekwill.hints.trivia.jdbc.service;

import com.tekwill.hints.trivia.jdbc.domain.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionsByLevel(int level);

    boolean save(Question question);

    boolean delete(Question question);

    List<Question> getAll();
}
