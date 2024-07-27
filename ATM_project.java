import java.util.Scanner;

import javax.swing.plaf.basic.BasicLabelUI;

public class ATM_project {
    int total_ammount=10000;
    int password=123;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ATM_project atm_project=new ATM_project();
        System.out.print("enter pin: ");
        int pin=scanner.nextInt();
        while (true) {
           
            if (atm_project.password==pin) {
                System.out.println("Enter 1 to check balance");
                System.out.println("Enter 2 to deposit amount");
                System.out.println("Enter 3 to debit amount");
                System.out.println("Enter 4 to print reciept");
                System.out.println("Enter 5 to exit");
                System.out.print("press key: ");
                int choosen=scanner.nextInt();
                switch(choosen){
                    case 1:
                       System.out.println(atm_project.total_ammount);
                       break;
                    case 2:
                        System.out.print("how much do you deposit to your account: ");
                        int amount=scanner.nextInt();
                        atm_project.total_ammount=amount+atm_project.total_ammount;
                        System.out.println("Your Balance is= "+atm_project.total_ammount);
                        break;
                    case 3:
                        System.out.println("how much do you want to debit: ");
                        int debit=scanner.nextInt();
                        atm_project.total_ammount=atm_project.total_ammount-debit;
                        System.out.println(atm_project.total_ammount);
                        break;
                    case 4:
                        System.out.println("Your Account Balance= "+atm_project.total_ammount);    
                        System.out.println("Thank You");
                        break;
                    case 5:
                        System.out.println("Thank You");
                        break;    
                }
    
            } else {
                System.out.println("enter correct pin!!");
                break;
            }
        }
    }
}
