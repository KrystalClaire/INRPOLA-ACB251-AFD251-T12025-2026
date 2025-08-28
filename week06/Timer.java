import java.util.Scanner;

public class Timer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int seconds = scanner.nextInt();

        try {
            for (int i = seconds; i > 0; i--) {
                System.out.println("Time left: " + i + " second(s)");
                Thread.sleep(1000); // Wait for 1 second
            }
            System.out.println("Time's up!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted!");
        }

        scanner.close();
    }
}