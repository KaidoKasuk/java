package QuizzConsoleApp;

public class Question {

    int id;
    String question;
    String opt1;
    String opt2;
    String opt3;
    String opt4;
    String answer;

    public void printInfo() {
        System.out.println("Question " + id + ": " + question);
        System.out.println("1. " + opt1);
        System.out.println("2. " + opt2);
        System.out.println("3. " + opt3);
        System.out.println("4. " + opt4);
        System.out.println();
    }
}
