package org.example;
import java.util.Scanner;
/**
 * @author Le Nguyen Tan Alex
 */
public class ModuloChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Asks user to input 2 numbers
        System.out.println("Please enter a number and a base, separated by space: ");
        int num = userInput.nextInt();
        int base = userInput.nextInt();
        userInput.nextLine();

        //Prints the string depending if the num is divisible by the base
        if (isDivisible(num, base))
            System.out.println(num + " is divisible by " + base);
        else
            System.out.println(num + " is not divisible by " + base);

        System.out.println(" ");

        //Asks user to input a letter
        System.out.println("Please enter an english letter: ");
        char c = userInput.nextLine().charAt(0);

        //Asks user to input a number and english letter
        System.out.println("Please enter a number and an english letter, separated by a space: ");
        int number = userInput.nextInt();
        char letter = userInput.next().charAt(0);

        //Prints the result depending the method is true or false FOR c AND number
        if (isDivisible(c, number))
            System.out.printf("'%s' is divisible by %d\n", c, number);
        else
            System.out.printf("'%s' is not divisible by %d\n", c, number);

        //Prints the result depending the method is true or false FOR c AND letter
        if (isDivisible(c, letter))
            System.out.printf("'%s' is divisible by %s", c, letter);
        else
            System.out.printf("'%s' is not divisible by %s", c, letter);
    }
    //Converts the letter in the variable char c into an integer
    public static int letterToNumber(char c){
        if (c >= 'a' && c <= 'z')
            return c - 'a';
        else if (c >= 'A' && c <= 'Z')
            return c - 'A';
        return c;
    }
    //Checks if number is divisible by 3
    public static boolean isDivisible(int num){
        return num % 3 == 0;
    }
    //Checks if number is divisible by the base
    public static boolean isDivisible(int num, int base){
        return num % base == 0;
    }
    //Checks if letter is divisible by 3
    public static boolean isDivisible(char letter){
        return letterToNumber(letter) % 3 == 0;
    }
    //Checks if letter inside char c is divisible by the 2nd number entered
    public static boolean isDivisible(char c, int number){
        return letterToNumber(c) % number == 0;
    }
    //Checks if letter inside char c is divisible by the letter entered
    public static boolean isDivisible(char c, char letter){
        return letterToNumber(c) % letterToNumber(letter) == 0;
    }
}