import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println(" Enter first integer ");

    // Numerical input
    int first number = myObj.nextInt();
    double second number = myObj.nextDouble();

    // Output input by user
    System.out.println("First number: " + first number ); 
    System.out.println("Second number: " + second number); 
    
    // addition 
    System.out.println(" 1 + 2 = " + (1 + 2));
    // subtraction
    System.out.println(" 1 - 2 = " + (1 - 2));
    // multiplication
    System.out.println(" 1 * 2 = " + (1 * 2));
    // division
    System.out.println(" 1 / 2 = " + (1 / 2));
}