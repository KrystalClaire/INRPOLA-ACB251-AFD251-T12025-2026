/**
* EvenNumberFinder.java
* This is the "worker" class. It contains the core logic for
* finding and displaying even numbers within a given range.
* It is separated from the main application to improve organization and reusability.
*/
public class OddNumberFinder {
 
    /**
     * Iterates through a specified range and prints all even numbers.
     * @param start The starting number of the range.
     * @param end The ending number of the range.
     */
    public void findAndDisplayOdd(int start, int end) {
        System.out.println("\nEven numbers in the range " + start + " to " + end + " are:");
 
        // Use a for loop to iterate from the start point to the end point
        for (int i = start; i <= end; i++) {
            // Check if the current number (i) is even.
            // A number is even if the remainder when divided by 2 is 0.
            if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
                findAndDisplayPrimeNumbers(i);
            }
        }
    }
    public void findAndDisplayOdds2(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        // Use a while loop to iterate from the start point to the end point
        int i = start;
        while ( i <= end ) {
            i++;
            // Check if the current number (i) is even.
            // A number is even if the remainder when divided by 2 is 0.
            if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
                findAndDisplayPrimeNumbers(i);
            }
        }
    }
    public void findAndDisplayOdds3(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");

        int i = start;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
                findAndDisplayPrimeNumbers(i);
            }
            i++;
        } while (i <= end);
    }
    private void findAndDisplayPrimeNumbers(int num) {
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        }
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}