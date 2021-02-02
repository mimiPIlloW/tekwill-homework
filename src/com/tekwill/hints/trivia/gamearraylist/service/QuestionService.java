package com.tekwill.hints.trivia.gamearraylist.service;

import com.tekwill.hints.trivia.gamearraylist.domain.Question;
import com.tekwill.hints.trivia.gamearraylist.repository.QuestionRepository;

import java.util.Collections;
import java.util.List;

public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestionsByLevel(int level) {
        List<Question> questionsByLevel = questionRepository.findQuestionsByLevel(level);
        Collections.shuffle(questionsByLevel);
        return questionsByLevel;
    }

}
