import java.util.Scanner;

public class inputscan {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read user input
        String name = scanner.nextLine();
       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print a greeting message
        System.out.println("Hello, " + name + "! " +age);

        // Close the scanner
        scanner.close();
    }
}
