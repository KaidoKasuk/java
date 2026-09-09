
package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String inputWord = reader.nextLine();

            if (words.contains(inputWord)) {
                System.out.println("You gave the word: " + inputWord + " twice");
                break;
            }

            words.add(inputWord);
        }
    }
}

