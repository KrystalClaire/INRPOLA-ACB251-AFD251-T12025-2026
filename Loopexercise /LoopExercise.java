import java.util.Scanner;
 

 
/**
* LoopExercise.java
* This is the "caller" class. It handles the user interface, reads input,
* and then calls the EvenNumberFinder class to perform the main task.
*/
public class LoopExercise {
 
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
        OddNumberFinder finder = new OddNumberFinder();
 
        // Call the method in the worker class to find and display the numbers
        finder.findAndDisplayOdds2(startPoint, endPoint);
        
        // It's good practice to close the scanner to prevent resource leaks
        inputScanner.close();
    }
}
 