class person{
    String name;
    person(String name){
       this.name=name;
       System.out.println(name);
    }
}
class employee extends person{
    employee(){
        super("deva");
        System.out.println("loving rose");
    }
}
public class superkey {
    public static void main(String[] args) {
        person person=new person("rose");
        employee employee=new employee();
      
        System.out.println(employee.name);
        System.out.println(person.name);
    }
}
