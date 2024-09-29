import java.util.Scanner;

public class Clock {

    // Method to convert seconds to minutes
    public static double secondstoMinutes(double seconds) {
        return seconds / 60;
    }

    // Method to convert seconds to hours
    public static double secondstoHours(double seconds) {
        return seconds / 3600;
    }

    // Method to convert minutes to seconds
    public static double minutestoSeconds(double minutes) {
        return minutes * 60;
    }

    // Method to convert minutes to hours
    public static double minutestoHours(double minutes) {
        return minutes / 60;
    }

    // Method to convert hours to seconds
    public static double hourstoSeconds(double hours) {
        return hours * 3600;
    }

    // Method to convert hours to minutes
    public static double hourstoMinutes(double hours) {
        return hours * 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            // Display the menu options
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
            System.out.print("Choose the Conversion: ");

            int choice = scanner.nextInt();  // User input for conversion choice
            System.out.print("Enter the Value: ");
            double value = scanner.nextDouble();  // User input for value to be converted
            double result = 0;

            // Perform conversion based on the choice
            switch (choice) {
                case 1:
                    result = secondstoMinutes(value);
                    System.out.println("Seconds to Minutes: " + result);
                    break;
                case 2:
                    result = secondstoHours(value);
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = minutestoSeconds(value);
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = minutestoHours(value);
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = hourstoSeconds(value);
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = hourstoMinutes(value);
                    System.out.println("Hours to Minutes: " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            // Ask if user wants to perform another conversion
            System.out.print("Do you want to convert time? (Y/N): ");
            char continueChoice = scanner.next().charAt(0);
            if (continueChoice == 'N' || continueChoice == 'n') {
                continueConversion = false;  // Exit loop if user chooses 'N'
            }
        }
        scanner.close();
    }
    //The other print output for issue1
    System.out.println("The other member needs to clone the remote source code to their local machine using the command: git clone [SSH/HTTPS Link]");
    System.out.println("OR simply download the Zip File from gitHub");
}
