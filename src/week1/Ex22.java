package week1;

import java.util.Scanner;

public class Ex22 {
public static void main(String[] args){
    String password = "Carrot";

    Scanner reader = new Scanner(System.in);



    while (true){
    System.out.println("Type the password: ");
    String inputPassword = reader.nextLine();
    if (password.equals(inputPassword)){
        System.out.println("Right!");
        System.out.println();
        System.out.println("The secret is: jryy qbar!");
        break;
    }
    else {
        System.out.println("Wrong!");
    }


    }
}}
