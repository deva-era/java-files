import java.util.Scanner;
public class project2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter game score: ");
        double score=scan.nextInt();

        if (score<50) {
            System.out.println("you need to improve");   
        }
        else if(score >=50 && score<=70){
            System.out.println("good job");    
        }
        else if(score>70){
            System.out.println("excellent performance");
        }
    }
}
class subject{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter tamil mark: ");
        double tamil=scan.nextInt();
        
        System.out.print("enter english mark: ");
        double english=scan.nextInt();

        System.out.print("enter maths mark: ");
        double maths=scan.nextInt();

        System.out.print("enter science mark: ");
        double science=scan.nextInt();

        System.out.print("enter social mark: ");
        double social=scan.nextInt();

        double avr = (tamil+english+maths+science+social)/5;


        if (avr<34) {
            System.out.println("mark is "+avr+" you need addition class");
        }else{
            System.out.println("mark is "+avr+" well");
        }
    }
}
class loan{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter salery: ");
        int salery=scan.nextInt();
        System.out.print("enter age: ");
        int age=scan.nextInt();

        if (salery>=20000 || age <=25) {
            System.out.print("enter required amount: ");
            int amount=scan.nextInt();
            if (amount<=50000) {
                System.out.println("you are eligible");
            }else{
                System.out.println("enter amount less than 50000");
            }
        }else{
            System.out.println("you are not eligible for loan");
        }

    }
}

class greater{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("enter value a: ");
        int a=scan.nextInt();
        System.out.print("enter value b: ");
        int b=scan.nextInt();
        int greater=(a>b?a:b);
        System.out.println("greater number is "+greater);
    }
}