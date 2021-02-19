package com.tekwill.hints.trivia.interfaces.repository;

import com.tekwill.hints.trivia.interfaces.domain.Question;

import java.util.List;

public interface QuestionRepository {
    List<Question> findQuestionsByLevel(int level);

    boolean save(Question question);

    boolean delete(Question question);

    List<Question> findAll();
}
