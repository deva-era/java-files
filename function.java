import java.util.Scanner;

public class function {
    int a=10;
    int b=20;
    void sum(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        function call=new function();
        call.sum();
    }
}
class excersize{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        excersize value=new excersize();
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter value of a: ");
        int a=scanner.nextInt();
        System.out.print("enter value of b: ");
        int b=scanner.nextInt();
        while (true) {
           String[] cals={"1.sum","2.sub","3.mul","4.div"};
           for (int i = 0; i < 4; i++) {
              System.out.println(cals[i]);
           }
           for (String var :cals ) {
               
           }
            System.out.print("enter function: ");
             int call=scanner.nextInt();
        
             if (call==1){
                value.sum(a,b);
             }else if(call==2){
                value.sub(a,b);
             }else if (call==3) {
                value.mul(a,b);
             } else if(call==4){
         
                value.div(a,b);
          }
        }  

    }
}
class sum{
    int add(int a,int b){
        return(a+b);

    }
    public static void main(String[] args) {
        sum one=new sum();
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter value of a: ");
        int a=scanner.nextInt();
        System.out.print("enter value of b: ");
        int b=scanner.nextInt();
        int value=one.add(a, b);
        System.out.println(value);
    }
    
}
class name{
    String nam(){
        return "deva";
    }
    String nam2(){
        return "lyla";
    }
    public static void main(String[] args) {
        name one=new name();
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a value: ");
        int a=scanner.nextInt();
       
       
        if (a==1) {
            String name=one.nam();
            System.out.println(name);
        }else{
            String name=one.nam2();
            System.out.println(name);
        }



    }
}
class same{
    void dev(int a){
        System.out.println("loving rose");
    }
    void dev(String a){
        System.out.println("loving lyla");
    }
    public static void main(String[] args) {
        same one=new same();
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a value: ");
        int a=scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter a name: ");
        String b=scanner.nextLine();
        one.dev(b);
        one.dev(a);

    }
}
