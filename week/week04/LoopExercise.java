 import java.util.Scanner; // import the Scanner class 


class LoopExercise {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    String Firstnumber, Secondnumber;
    
    // Firstnumber and press Enter
    System.out.println("Firstnumber"); 
    Firstnumber start = myObj.nextint();  

    System.out.println("Secondnumber"); 
    Secondnumber end = myObj.nextint();  
       
    System.out.println("Even numbers from" + start + " to " + end);        
  
  
    
    // for loop  
    for (int Firstnumber ; Firstnumber < Secondnumber; ++Firstnumber) {
      System.out.println(" "); 
       System.out.println( Firstnumber +" "+ Secondnumber); 
    }
  }
}