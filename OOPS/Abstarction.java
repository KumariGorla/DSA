package OOPS;
abstract class Animal{
    //Abstract 
    abstract void walk();
    //Non-Abstract  method
    public void eat(){
        System.out.println("Animal eats");
    }
    //It can have constructors and static methods
    Animal(){
        System.out.println("You are creating a new constructor");
    }

}
class Horse extends Animal{
    Horse(){
        System.out.println("You are created another constructor");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walks with 2 legs");
    }
}
public class Abstarction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
    
}
