import java.util.Random;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println("num "+i);
        }
    }
}
class reverse {
    public static void main(String[] args) {
        for(int i=10;i>=0;i--){
            System.out.println("num "+i);
        }
    }
}

class nestloop{
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
          System.out.println("");
        }
    }
}
class whils{
    public static void main(String[] args) {
        Random random=new Random();
        int rand=0;
        int i=0;
        while (rand!=25){
        rand=random.nextInt(115);
        System.out.println(rand);
        }
       

    
    }

}
class dowhils{
    public static void main(String[] args) {
        int i=9;
        do {
            System.out.println("lyla");
            i+=1;
        } while (i<=5);
    }
}
class proj{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value: ");
        int value=scanner.nextInt();
        while (value>11) {
            System.out.println("enter value <10");
            value=scanner.nextInt();
        }
        System.out.println("correct");

    }
}
