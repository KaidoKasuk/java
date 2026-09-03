package week2;

import java.util.Scanner;

public class Ex30 {

    public  static  void main(String[] args){
        System.out.println("Up to what number?");
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int inputNumber = Integer.parseInt(reader.nextLine());

        while (true) {
            if (i > inputNumber){
                break;

            }
            else {
            System.out.println( +i);
            i++;
        }



    }
}}
