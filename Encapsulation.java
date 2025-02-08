//Encapsulation in Java is a fundamental OOP (object-oriented programming) principle that combines data and methods in a class.
// It allows implementation details to be hidden while exposing a public interface for interaction.
//The getName() and setName() methods, known as getters and setters, provide controlled access to the name attribute. 
//This encapsulation mechanism protects the internal state of the Programmer object and allows for better control and flexibility in how the name attribute is accessed and modified.

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


// Getters
// Getters are methods that return the value of a private variable. They are typically named getVariableName and do not take any parameters.

// Setters
// Setters are methods that set the value of a private variable. They are typically named setVariableName and take a single parameter, which is the new value for the variable.