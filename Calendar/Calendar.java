import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.print("Month: ");
        String month = sc.nextLine();

        System.out.print("Number of days: ");
        int numDays = sc.nextInt();

        System.out.print("Starting day (1 for Mon upto 7 for sunday): ");
        int startDay = sc.nextInt();

        System.out.println();
        System.out.println(month + " 2025");
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= numDays; i++) {
            if (i < 10) {
                System.out.print("  " + i + " ");
            } else {
                System.out.print(" " + i + " ");
            }

            if ((i + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}