package OOPS;
//interface Animal{
//    int eyes = 2;
//    void walk();
//   
//
//}
//interface Harbivore{
//
//}
//class Horse implements Animal, Harbivore{
//    public void walk(){
//        System.out.println("Walks on 4 legs");
//    }
//}
class Student{
    String name;
    static String school;
    public static void changeSchool(){
        school = "BIET school";
    }

}
public class Interfaces {
    public static void main(String[] args) {
        //Horse h1 = new Horse();
        //h1.walk();
        Student.school = "Zpgh school";
        Student s1 = new Student();
        s1.name = "Honey";
       // System.out.println(s1.school);
    }
    
}
