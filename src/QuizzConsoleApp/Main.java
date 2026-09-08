package QuizzConsoleApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Question question1 = new Question();

        question1.id = 1;
        question1.question = "Which of these is a Java data type?";
        question1.opt1 = "String";
        question1.opt2 = "System";
        question1.opt3 = "Scanner";
        question1.opt4 = "Main";
        question1.answer = "String";
        question1.printInfo();

        Scanner q1 = new Scanner(System.in);
        System.out.println("Enter the right answer 1-4:");
        int answer1 = q1.nextInt();
        if (answer1 == 1) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("Correct answer: " + question1.answer);
        }
        Question question2 = new Question();

        question2.id = 2;
        question2.question = "Which of these data types is used for whole numbers ?";
        question2.opt1 = "Boolean";
        question2.opt2 = "Char";
        question2.opt3 = "Int";
        question2.opt4 = "Double";
        question2.answer = "Int ";
        question2.printInfo();

        Scanner q2 = new Scanner(System.in);
        System.out.println("Enter the right answer 1-4:");
        int answer2 = q2.nextInt();
        if (answer1 == 1) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("Correct answer: " + question2.answer);
        }
        Question question3 = new Question();

        question3.id = 3;
        question3.question = "Which keyword is used to create a new object in Java?";
        question3.opt1 = "class";
        question3.opt2 = "new";
        question3.opt3 = "this";
        question3.opt4 = "void";
        question3.printInfo();
        Scanner q3 = new Scanner(System.in);
        System.out.println("Enter the right answer 1-4:");
        int answer3 = q3.nextInt();
        if (answer3 == 2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("Correct answer: " + question2.answer);
        }
    }
}
