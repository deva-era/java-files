import java.util.Scanner;
public class sacnproject {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter name: "); 
    String name = scan.nextLine();
    System.out.print("enter score: ");
    double score= scan.nextDouble();
    scan.nextLine(); 
    System.out.print("enter department: ");
    String department =scan.nextLine();
    System.out.println("my name is "+name);
    System.out.println("my score is "+score/10 +"/10");
    System.out.println("my department is "+department); 
    System.out.println(name.charAt(1));

   }    
}
