import java.util.Scanner;

public class Solution01 {

    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution 01
     *  Copyright 2021 first_name last_name
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String s1;
        s1 = input.nextLine();
        System.out.print("Hello, ");
        System.out.print(s1);
        System.out.print(", nice to meet you!");

    }
}
