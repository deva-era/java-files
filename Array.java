import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        int[] data=new int[4];
        Scanner scan=new Scanner(System.in);
        
        System.out.print("enter a number: ");
        data[0]= scan.nextInt();
        System.out.print("enter a number: ");
        data[1]= scan.nextInt();
        System.out.print("enter a number: ");
        data[2]= scan.nextInt();
        System.out.print("enter a number: ");
        data[3]= scan.nextInt();
       
        System.out.println("total= "+data[0]+data[1]+data[2]+data[3]);


}
}

class loops1{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.print("enter limit:");
            int a=scan.nextInt();
            int[] data=new int[a];
            int b=0;
            int c=0;
            int middle=a%2;
            for (int i = 0; i < a; i++) { 
                System.out.print("enter a number:");
                data[i]=scan.nextInt();
                b+=data[i];
                c+=i;
                
            }
            for (int i = 0; i < a; i++) { 
                System.out.println(data[i]);
                //c+=i;
            }
            System.out.println(b);
            System.out.println(c);
            if (middle==0) {
                
            } else {
                System.out.println("middle is= "+data[a/2]);
            }
           
            // for (int dev:data) {
            //     System.out.println(dev);
            
        }
    }
}
class table2{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter which table you need: ");
        int table=scanner.nextInt();
        System.out.print("enter limit of table: ");
        int limit=scanner.nextInt();
        int[] value=new int[limit];
        int[] tabledata=new int[limit];
        int b=0;
        for (int i = 0; i <limit; i++) {
            value[i]=(i+1)*table;
            tabledata[i]=i+1;
            b+=1;
        }
        for (int i = 0; i <limit; i++) {
            System.out.println(tabledata[i]+"*"+table+"= "+value[i]);
            
        }
        System.out.println("total= "+b);
    } 

}//or
//public class temp{
    //public static void main(String[] args) {
        //Scanner scanner=new Scanner(System.in);
        //System.out.print("enter which table you need: ");
        //int table=scanner.nextInt();
        //System.out.print("enter limit of table: ");
        //int limit=scanner.nextInt();
        //for (int i = 1; i <= limit; i++) {
      //      System.out.println(i+"*"+table+"= "+i*table);
    //    }
  //  }
