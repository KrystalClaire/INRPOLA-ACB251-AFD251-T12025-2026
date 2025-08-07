import java.util.Scanner;

class Twoinputs {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println(" Enter first integer ");

    // Numerical input
    int firstnumber = myObj.nextInt();
    double secondnumber = myObj.nextDouble();

    // Output input by user
    System.out.println("First number: " + firstnumber ); 
    System.out.println("Second number: " + secondnumber); 
    
    // addition 
    System.out.println(" a + b = " + (firstnumber + secondnumber ));
    // subtraction
    System.out.println(" a - b = " + (firstnumber - secondnumber ));
    // multiplication
    System.out.println(" a * b = " + (firstnumber * secondnumber ));
    // division
    System.out.println(" a / b = " + (firstnumber / secondnumber ));
  }
}