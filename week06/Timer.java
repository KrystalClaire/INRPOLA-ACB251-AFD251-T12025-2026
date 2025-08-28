import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start time
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        // Calculate total time in seconds
        int totalSeconds = minutes * 60 + seconds;

        // Create a 2D array to store [minutes][seconds] at each step
        int[][] timeArray = new int[totalSeconds][2];

        // Fill the array with countdown times
        int currentSeconds = totalSeconds;
        for (int i = 0; i < totalSeconds; i++) {
            int min = currentSeconds / 60;
            int sec = currentSeconds % 60;
            timeArray[i][0] = min;
            timeArray[i][1] = sec;
            currentSeconds--;
            
        }
            System.out.println("\nUmpisa\n");
        // Countdown using the timeArray
        for (int i = 0; i < totalSeconds; i++) {
            int min = timeArray[i][0];
            int sec = timeArray[i][1];

            // Display the time
            
            System.out.printf("Time left: %02d:%02d\n", min, sec);

            // Wait 1 second
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 1000) {
                // Do nothing — simulate delay
            }
        }

        // Final display when timer reaches 00:00
        System.out.println("Time left: 00:00");
        System.out.println("AYOKO NA!");

        scanner.close();
    }
}