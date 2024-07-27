import java.util.Scanner;

public class project4 {
    int evenoradd(int a){
        if (a%2==0) {
            return 0;
        }else{
            return a;
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        project4 find=new project4();
       while (true) {
         System.out.print("enter number: ");
         int a=scanner.nextInt();
         int answer=find.evenoradd(a);
         if (answer==0) {
             System.out.println(a+" is even");
         }else{
             System.out.println(a+" is odd");
         }
       }
        }
}
class school{
    String mark(int a){
       if(a<=34){
        return "fail";
       }else{
        return "pass";
       }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        school one=new school();
        System.out.print("enter mark: ");
        int a=scanner.nextInt();
        String c=scanner.nextLine();
        String mark=one.mark(a);       
        System.out.println(mark);
    }

}