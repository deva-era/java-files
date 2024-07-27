import java.util.Scanner;
public class booleanif{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        if(a==b){
            System.out.println("equal");
        }
        if (a<b) {
            System.out.println("good");
        } else {
          System.out.println("run again");  
        }


    }
}
class comparing{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.commmited");
        System.out.println("2.break up");
        System.out.print("enter megna state: ");
        int state = scan.nextInt();
        
        if(state==1){
            System.out.println("deva weds maha");
        }
        else{
            System.out.println("deva weds some");
        }

    }
}