//Encapsulation is the fu hiding the data
 /*class Human{
    private int age=11;
   private String name="Rohith";

   public int getage(){
return age;
   }

   public String getname(){
    return name;
   }
 }
public class Encapsulation {
    public static void main(String[] args) {
        
    
    Human obj = new Human();
    // obj.age = 20;
    // obj.name="Rohith";
   System.out.println(obj.getage() + ":"+ obj.getname());
}
} */


//one way is we can use private i.e the variable that is declared as private can accesable by private class, we can acces them but not directly
//wc can access private by methoeds
//we can acces them inside the methoed of same class
//everytime we create a variable private no one should access it outside  it can be used by their own methoeds.

//one problem i dont want to assign the value their but i want to set the value in other class
class Human{
    private int age;
   private String name;

   public int getAge(){
return age;
   }
     public void setAge(int a){
       age = a;
     }

     public String getName(){
       return name;
     }

     public void setName(String n){
        name=n;
     }
 }
public class Encapsulation {
    public static void main(String[] args) {
        
    
    Human obj = new Human();
    obj.setAge(20);
    obj.setName("Rohith");
   System.out.println(obj.getAge() + ":"+ obj.getName());
}
}

//how do i set the value ?  for detting i use get for setting i use set 
 