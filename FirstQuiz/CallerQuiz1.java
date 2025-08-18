import java.util.Scanner;
 

 
/**
* OddAndEvenNumberFinder.java
* This is the "caller" class. It handles the user interface, reads input,
* and then calls the OddAndEvenNumberFinder class to perform the main task.
*/
public class CallerQuiz1 {
 
    public static void main(String[] args) {
 
        // Create a Scanner object to read user input from the console
        Scanner inputScanner = new Scanner(System.in);
 
        // Prompt the user for the starting number
        System.out.print("Enter the starting number: ");
        int startPoint = inputScanner.nextInt();
 
        // Prompt the user for the ending number
        System.out.print("Enter the ending number: ");
        int endPoint = inputScanner.nextInt();
 
        // Create an instance of our "worker" class
        WorkerQuiz1 finder = new WorkerQuiz1();
 
        // Call the method in the worker class to find and display the numbers
        finder.findAndDisplayOddAndEvenNumber(startPoint, endPoint);
        
        // It's good practice to close the scanner to prevent resource leaks
        inputScanner.close();
    }
}