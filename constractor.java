import java.util.Scanner;

public class constractor {
      int a;
      String b;
      constractor(){
        System.out.println("thanks");
      }
        public static void main(String[] args) {
            // constractor one=new constractor();
            constractor one=new constractor();
            System.out.println(one.a);
            System.out.println(one.b);
     }

    }
    
class exam{
  int mark;
  String name;
  exam(int a,String b){
    mark=a;
    name=b;
    System.out.println("hello");
    System.out.println("your mark is "+mark+" name is "+name);
  }
  exam(){
    System.out.println("hello");
  }
  public static void main(String[] args) {
    exam one=new exam(35,"dev");
    exam two=new exam(3,"rose");
    exam three=new exam();
    exam four=new exam();
                                                                                                                                                          
  }
} 
class awss extends exam{
  public static void main(String[] args) {
    exam three=new exam();
  }
}
