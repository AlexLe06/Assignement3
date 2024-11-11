package org.example;
import java.util.Scanner;
/**
 *
 * @author Le Nguyen Tan Alex
 */
public class CaseConverter{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Asks user to input a word
        System.out.println("Please enter a word: ");
        String word = userInput.nextLine();

        //Asks user to input a letter that is shown here
        System.out.printf("%s\n1.%26s\n2.%26s\n3.%26s\n",
                "Please choose the case you want to convert: ",
                "'l' or 'L' for lowercase",
                "'u' or 'U' for uppercase",
                "'t' or 'T' for titlecase");
        char caseType = userInput.nextLine().charAt(0);
        System.out.println(" ");
        //Prints the result
        System.out.printf("%-37s : %s\n%-37s : %s\n%s : %s",
                "Original word", word,
                "Calling the first convertCase method", convertCase(word),
                "Calling the second convertCase method", convertCase(word, caseType));
    }
    //Converts the first letter uppercase and the rest lower case and returns it
    public static String convertCase(String word){
        String wordSubstring = word.substring(0, 1).toUpperCase()
                + word.substring(1).toLowerCase();
        return wordSubstring;
    }
    //Converts the word uppercase, lowercase or tilecase depending on the letter given
    public static String convertCase(String word, char caseType){
        return switch(caseType){
            case 'l', 'L' -> word.toLowerCase();
            case 'u', 'U' -> word.toUpperCase();
            case 't', 'T' -> word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            default -> {
                System.out.println("Unknown case definition");
                yield "Error";
            }
        };
    }

}