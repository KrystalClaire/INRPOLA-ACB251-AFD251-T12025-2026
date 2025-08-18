/**
 * OddAndEvenNumberFinder.java
 * This is the "worker" class. It contains the core logic for
 * finding and displaying:
 * - Odd prime numbers using a while loop
 * - Even numbers divisible by 3 using a for loop
 */
public class WorkerQuiz1 {

    public void findAndDisplayOddAndEvenNumber(int start, int end) {
        // While loop for odd prime numbers
        int i = start;
        System.out.println("\nOdd prime numbers in the range:");
        while (i <= end) {
            if (i % 2 != 0 && isPrime(i)) {
                System.out.println(i + " is odd and a prime number.");
            }
            i++;
        }

        // For loop for even numbers divisible by 3
        System.out.println("\nEven numbers divisible by 3 in the range:");
        for (int j = start; j <= end; j++) {
            if (j % 2 == 0 && j % 3 == 0) {
                System.out.println(j + " is even and divisible by 3.");
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
