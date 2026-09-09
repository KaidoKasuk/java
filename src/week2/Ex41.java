package week2;

import java.util.Scanner;

public class Ex41 {

    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 101);
        System.out.println( "generated number:"+randomNum);
        System.out.println("Guess a number:");
        Scanner reader = new Scanner(System.in);
        int inputNumber = reader.nextInt();
        int guessCount = 1;

        while (randomNum != inputNumber) {

            if (randomNum > inputNumber) {
                System.out.println("bigger " + "guesses made: " + guessCount);
            } else{
                System.out.println("smaller " + "guesses made: " + guessCount);
            }

            guessCount++;
            inputNumber = reader.nextInt();


        }
        System.out.println("Congratulations, your guess is correct!");


        }
    }
