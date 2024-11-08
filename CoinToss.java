package org.example;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author Le Nguyen Tan Alex
 */
public class CoinToss {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int headcount = 0; //Initializing headcount value to 0
        int tailsCount = 0; //Initializing headcount value to 0
        System.out.println("1. Toss Coin\n2. Exit\nChoice: ");
        int choice = userInput.nextInt();

        //Checks loop if choice == 1 or 2
        while (choice == 1) {
            //Runs the method and if true then headcount++ and if false then tailsCount++
            if (flip())
                headcount++;
            else
                tailsCount++;
            System.out.printf("Head: %d Tails: %d\n", headcount, tailsCount);

            //Updates value choice
            System.out.println("1. Toss Coin\n2. Exit\nChoice: ");
            choice = userInput.nextInt();
        }

    }
    //Return boolean for random number above or under 0.5
    public static boolean flip(){
        return Math.random() >= 0.5;
    }
}