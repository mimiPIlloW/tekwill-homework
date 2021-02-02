package com.tekwill.hints.trivia.gamearray.service;

import com.tekwill.hints.trivia.gamearray.domain.Question;
import com.tekwill.hints.trivia.gamearray.repository.QuestionRepository;
import com.tekwill.hints.trivia.gamearray.util.Shuffler;

public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question[] getQuestionsByLevel(int level) {
        return Shuffler.shuffleQuestions(questionRepository.findQuestionsByLevel(level));
    }

}
