import java.util.Scanner;
class animal{
    String name;
    int age;

    void makesound(){
        System.out.println("animal make sound");
    }
}
class dog extends animal{
    @Override
    void makesound() {
        System.out.println("dog makes sound");
    }
    void fetch(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    String colour;
    @Override
    void makesound() {
        System.out.println("cat meows");
    }
    void climb(){
        System.out.println("cat is climbing");
    }

}

public class zoo{
    public static void main(String[] args) {
                  dog dog=new dog();
                  cat cat=new cat();
                  Scanner scanner=new Scanner(System.in);
                  String[] name={"dog, ","cat"};
                  for (String var : name) {
                      System.out.println(var);
                  }
                  System.out.print("enter animal name: ");
                  String nameselect=scanner.nextLine();
                  System.out.print("enter animal age: ");
                  int ageselect=scanner.nextInt();
                  if (nameselect=="dog") {
                      System.out.println(dog.name="jonny");
                      if (ageselect<=5) {
                          dog.makesound();
                      }else{
                          dog.fetch();
                      } 
                  }else if (nameselect=="cat") {
                      System.out.println( cat.name="tom");
                      if (ageselect<=5) {
                          cat.makesound();
                      }else{
                          cat.climb();
                      }
                  }else{
                      System.out.print("enter available animal name: ");
                      nameselect=scanner.nextLine();
                  }
                  
    }
}
class forloop{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] number=new int[6];
        for (int i = 0; i < number.length; i++) {
            System.out.print("enter number: ");
            int a=scanner.nextInt();
            number[i]=a;
        }
        // for (int var: number) {
        //     System.out.println(number);
        // }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+",");
        }
    }
}