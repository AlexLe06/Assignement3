package org.example;
import java.util.Scanner;

/**
 * @author Le Nguyen Tan Alex
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Get the 2 numbers from the string to transform the string into double
        System.out.println("Please enter two numbers, separated by space: ");
        String numbers = userInput.nextLine();
        double num1 = Double.parseDouble(numbers.substring(0, numbers.indexOf(" ")));
        double num2 = Double.parseDouble(numbers.substring(numbers.indexOf(" ")));

        //Get the operator
        System.out.println("Please enter the operator (+, -, * or /): ");
        char oper = userInput.nextLine().charAt(0);

        //Enter the formula
        System.out.println("Please enter the formula (e.g.: \"3.14 * 2\"): ");
        String formula = userInput.nextLine();

        //Print everything
        System.out.printf("%-24s : %.2s + %.2s = %.2s\n", "Calling the first method",
                num1, num2 ,calcResult(num1, num2));
        System.out.printf("%-24s : %.2s %.2s %.2s = %.2s\n", "Calling the second method",
                num1, oper, num2 ,calcResult(num1, num2, oper));
        System.out.printf("%-24s : %.2s = %.2s\n", "Calling the third method",
                formula ,calcResult(formula));
    }
    public static double calcResult(double num1, double num2){
        //Calculates the sum of the 2 numbers
        double sum = num1 + num2;
        return sum;
    }
    public static double calcResult(double num1, double num2, char oper) {
        //Find the case where the operator is the same to calculate the result
        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalStateException("Unexpected value: " + oper);
        };
    }
    public static double calcResult(String formula){
        //Finds the 2 numbers from the formula
        double num1 = Double.parseDouble(formula.substring(0,formula.indexOf(' ')));
        double num2 = Double.parseDouble(formula.substring(formula.indexOf(' ')+2));
        char oper = formula.charAt(formula.indexOf(' ')+1); // Find the operator from the formula
        //Find the case where the operator is the same to calculate the result
        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalStateException("Unexpected value: " + oper);
        };
    }
}