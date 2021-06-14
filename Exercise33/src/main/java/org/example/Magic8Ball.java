package org.example;
import java.util.Scanner;
import java.util.Random;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class Magic8Ball {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int rndm = rand.nextInt(3);
        String userInput;

        System.out.print("What's your question? ");
        userInput = scnr.nextLine();
        if(rndm == 0)
        {
            System.out.print("Yes.");
        }
        if(rndm == 1)
        {
            System.out.print("No.");
        }
        if(rndm == 2)
        {
            System.out.print("Maybe.");
        }
        if(rndm == 3)
        {
            System.out.print("Ask again later.");
        }

    }
}
