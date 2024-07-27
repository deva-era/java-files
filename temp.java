import java.util.Scanner;

public class temp {
    int total_ammount;
    int balance;
    int password=123;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        temp atm_project=new temp();
        System.out.print("enter pin: ");
        int pin=scanner.nextInt();
        System.out.println("Enter 1 to check balance");
    }
}
