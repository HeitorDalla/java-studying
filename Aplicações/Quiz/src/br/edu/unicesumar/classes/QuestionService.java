package br.edu.unicesumar.classes;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService () {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of int", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "size of int", "2", "6", "4", "8", "4");
        questions[3] = new Question(4, "size of int", "2", "6", "4", "8", "4");
        questions[4] = new Question(5, "size of int", "2", "6", "4", "8", "4");
    }

    public void displayQuestions () {
        for (Question question : questions) {
            System.out.println(question.toString());
        }
    }
}
