package QuizzConsoleApp;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {

    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<String> selection = new ArrayList<>();
    private Scanner reader = new Scanner(System.in);

    Question question1 = new Question(
            1,
            "Which keyword is used to create a class in Java?",
            "class",
            "new",
            "object",
            "create",
            "4"
    );

    Question question2 = new Question(
            2,
            "Which data type is used to store a whole number?",
            "String",
            "int",
            "boolean",
            "double",
            "2"
    );

    Question question3 = new Question(
            3,
            "Which symbol is used to end a statement in Java?",
            ".",
            ":",
            ";",
            ",",
            "3"
    );

    Question question4 = new Question(
            4,
            "Which method is the starting point of a Java program?",
            "start()",
            "run()",
            "main()",
            "begin()",
            "3"
    );

    Question question5 = new Question(
            5,
            "Which keyword is used to create a new object?",
            "this",
            "new",
            "object",
            "create",
            "2"
    );

    public QuestionService() {
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
    }

    public void playQuiz() {

        for (Question question : questions) {

            System.out.println(question.getId() + ". " + question.getQuestion());
            System.out.println("1. " + question.getOpt1());
            System.out.println("2. " + question.getOpt2());
            System.out.println("3. " + question.getOpt3());
            System.out.println("4. " + question.getOpt4());

            System.out.println("Your answer:");
            String userAnswer = reader.nextLine();

            selection.add(userAnswer);
        }
    }
    public void printScore() {
        int score = 0;
        int i = 0;

        for (Question question : questions) {
            if (selection.get(i).equals(question.getAnswer())) {
                score++;
            }
            i++;
        }

        System.out.println("Your score: " + score + "/" + questions.size());
    }
}