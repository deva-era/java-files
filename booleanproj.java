import java.util.Scanner;
public class booleanproj {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("enter number: ");
    int num = scan.nextInt();
    
    if(num%3==0 && num%5==0){
        System.out.println("number is divisible by 3 & 5 ");
    }
    else{
        System.out.println("number isn't divisible by 3 & 5 ");
    }
    }
    
}
class inttype{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=scan.nextInt();
        if (num%2==0) {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
