import java.util.Scanner;
public class multiclass {
        Scanner scanner=new Scanner(System.in);
       /// System.out.print("enter a value: ");
        int value=scanner.nextInt();
        int i=0;


        public static void main(String[] args) {
            multiclass one=new multiclass();
            multiclass two=new multiclass();
            while (one.i<3) {
                one.i+=1;
                System.out.println(one.value);

            }
        System.out.println(one.i);

       
           System.out.println(two.i);
           while (two.i<5) {
              one.i+=1;
             System.out.println(two.value);

         }    
        }
    }    
        



