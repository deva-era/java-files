import java.util.Scanner;
public class project3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter start value: ");
        int a=scan.nextInt();
        System.out.print("enter end value: ");
        int b=scan.nextInt();
        int c=a+1;
        for(int i=c;i<=b;i++){
            System.out.println(i);
        }
    }
}
class evenloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter start value: ");
        int a=scan.nextInt();
        System.out.print("enter end value: ");
        int b=scan.nextInt();
        int c=a;
        for(int i=c;i<=b;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
class oddloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter start value: ");
        int a=scan.nextInt();
        System.out.print("enter end value: ");
        int b=scan.nextInt();
        int c=a;
        int oddcount=0;
        for(int i=c;i<=b;i++){
            if (i%2==0) {
            }
            else{
                oddcount=oddcount+1;
                System.out.println(oddcount+". "+i);
            }
            
        }
        System.out.println(oddcount);
    }
}       

