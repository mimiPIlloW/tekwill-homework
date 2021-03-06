package com.tekwill.hints.trivia.game.engine;

import com.tekwill.hints.trivia.game.domain.Answer;
import com.tekwill.hints.trivia.game.domain.Question;

public class Questions {

    public static Question LEVEL_1_QUESTION_1 = new Question(100, 1, "How many wings does a mosquito have?",
            new Answer("Two", false, "A"),
            new Answer("Three", true, "B"),
            new Answer("Four", false, "C"),
            new Answer("Ten", false, "D"));

    public static Question LEVEL_1_QUESTION_2 = new Question(150, 1, "Ascorbic acid is a form of which vitamin?",
            new Answer("A", false, "A"),
            new Answer("B", false, "B"),
            new Answer("C", true, "C"),
            new Answer("D", false, "D"));

    public static Question LEVEL_2_QUESTION_1 = new Question(200, 2, "Humans and chimpanzees share roughly how much DNA?",
            new Answer("98%", false, "A"),
            new Answer("77%", true, "B"),
            new Answer("100%", false, "C"),
            new Answer("0%", false, "D"));

    public static Question LEVEL_2_QUESTION_2 = new Question(250, 2, "'Felis domesticus' is Latin for which animal?",
            new Answer("Dog", false, "A"),
            new Answer("Cat", false, "B"),
            new Answer("Mouse", false, "C"),
            new Answer("Chicken", true, "D"));

    public static Question LEVEL_3_QUESTION_1 = new Question(300, 3, "Where is the heart of the shrimp situated?",
            new Answer("In the head", true, "A"),
            new Answer("In the shoulder", false, "B"),
            new Answer("In the foot", false, "C"),
            new Answer("In the solpa", false, "D"));
}
